package step4.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import step3.util.StringUtil;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("문자열_관련_유틸_클래스")
public class StringUtilTest {

    @DisplayName("parseLottoText_쉼표구분자_파싱_성공")
    @ParameterizedTest
    @ValueSource(strings = {"1,2", "1, 2"})
    public void parseLottoText_01(String numbers) {
        String[] result = step3.util.StringUtil.parseLottoText(numbers);
        assertThat(result).isEqualTo(new String[]{"1", "2"});
    }

    @DisplayName("parseLottoText_빈값_들어올_경우_빈값_반환")
    @Test
    public void parseLottoText_02() {
        String[] result = StringUtil.parseLottoText("");
        assertThat(result).isEqualTo(new String[]{""});
    }
}
