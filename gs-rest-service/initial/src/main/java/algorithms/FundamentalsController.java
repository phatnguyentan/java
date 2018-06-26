package algorithms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FundamentalsController {

    @RequestMapping("/fundamentals/binary")
    public int[] greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        // return new Greeting(counter.incrementAndGet(), String.format(template,
        // name));
        // return null;
        return new int[] { 1, 2, 3 };
    }
}
