//The correct way of using date time

import java.time.*

val zonedDateTime = ZonedDateTime.of(LocalDateTime.now(ZoneId.of("Asia/Tehran")), ZoneId.of("Asia/Tehran"))
val formatted = s"""${zonedDateTime.getHour}:${zonedDateTime.getMinute}:${zonedDateTime.getSecond}.${zonedDateTime.getNano} ${zonedDateTime.getDayOfWeek} ${zonedDateTime.getDayOfMonth} ${zonedDateTime.getMonth}(${zonedDateTime.getMonthValue}) ${zonedDateTime.getYear} ${zonedDateTime.getOffset}[${zonedDateTime.getZone}]"""