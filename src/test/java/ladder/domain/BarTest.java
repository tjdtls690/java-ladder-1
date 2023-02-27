package ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BarTest {
    
    @Test
    @DisplayName("Bar의 valueOf 메서드에 true를 넣으면, true값을 가진 Bar를 반환한다.")
    void valueOfBarTrue() {
        // given, when
        Bar bar = Bar.valueOfBar(true);
        
        // then
        assertThat(bar).isEqualTo(Bar.TRUE);
    }
    
    @Test
    @DisplayName("Bar의 valueOf 메서드에 false를 넣으면, false값을 가진 Bar를 반환한다.")
    void valueOfBarFalse() {
        // given, when
        Bar bar = Bar.valueOfBar(false);
        
        // then
        assertThat(bar).isEqualTo(Bar.FALSE);
    }
    
    @Test
    @DisplayName("Bar.TRUE의 isExistBar 메서드를 호출하면 true가 나온다.")
    void isExistBar_true() {
        // given & when& & then
        assertThat(Bar.TRUE.isExistBar()).isTrue();
    }
    
    @Test
    @DisplayName("Bar.FALSE의 isExistBar 메서드를 호출하면 false가 나온다.")
    void isExistBar_false() {
        // given & when& & then
        assertThat(Bar.FALSE.isExistBar()).isFalse();
    }
}
