package stub;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import java.util.Arrays;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        GradeSystem gradeSystem=mock(GradeSystem.class);
        GradeService gradeService=new GradeService(gradeSystem);
        when(gradeSystem.gradesFor(anyLong())).thenReturn(Arrays.asList(90.0, 85.0, 95.0));
        Assertions.assertEquals(90.0,gradeService.calculateAverageGrades(anyLong()));
    }
}
