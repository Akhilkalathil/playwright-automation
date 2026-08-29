import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.microsoft.playwright.Page;

public class utility {

    public static byte [] capturescreenshot(Page page)
    {
        SimpleDateFormat customformat = new SimpleDateFormat("dd_MM_yy_HH_mm_ss");
        Date date = new Date();
        String newdate = customformat.format(date);
        byte [] array = page.screenshot(new Page.ScreenshotOptions().setFullPage(false).setPath(Paths.get("image/"+"Screenshot"+newdate+".png")));
        return array;
    }

}

