package school.mjc.stage0.conditions.task4;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class  MaxNumberPrinterTest extends BaseIOTest {

    @Test
    void printGreatestWhenAllUniquePrintsGreatest() {
        MaxNumberPrinter maxNumberPrinter = new MaxNumberPrinter();

        maxNumberPrinter.printGreatest(1,2,3);

        assertOutEquals("3\n");
    }

    @Test
    void printGreatestWhenTopNotAllUniquePrintsGreatest() {
        MaxNumberPrinter maxNumberPrinter = new MaxNumberPrinter();

        maxNumberPrinter.printGreatest(1,0,1);

        assertOutEquals("1\n");
    }
    @Test
    void printGreatestWhenBottomNotAllUniquePrintsGreatest() {
        MaxNumberPrinter maxNumberPrinter = new MaxNumberPrinter();

        maxNumberPrinter.printGreatest(1,9,1);

        assertOutEquals("9\n");
    }

    @Test
    void notContainsImports() throws IOException {
        Path path = Paths.get("src/main/java/school/mjc/stage0/conditions/task4/MaxNumberPrinter.java");
        List<String> strings = Files.readAllLines(path);
        List<String> result = strings.stream()
                .filter(line -> line.contains("import"))
                .collect(Collectors.toList());

        assertEquals(0, result.size());
    }
}