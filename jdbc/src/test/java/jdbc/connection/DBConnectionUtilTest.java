package jdbc.connection;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class DBConnectionUtilTest {

  @Test
  void connection() {
    Connection connection = DBConnectionUtil.getConnection();
    Assertions.assertThat(connection).isNotNull();
  }
}