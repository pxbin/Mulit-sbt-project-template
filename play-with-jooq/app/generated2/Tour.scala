/**
 * This class is generated by jOOQ
 */
package generated2


import generated2.tables.MeEnviprotect
import generated2.tables.MeWeather
import generated2.tables.TourBus

import java.util.ArrayList
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import org.jooq.Table
import org.jooq.impl.SchemaImpl


object Tour {

	/**
	 * The reference instance of <code>tour</code>
	 */
	val TOUR = new Tour
}

/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = Array(
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	),
	comments = "This class is generated by jOOQ"
)
class Tour extends SchemaImpl("tour") {

	override def getTables : List[Table[_]] = {
		val result = new ArrayList[Table[_]]
		result.addAll(getTables0)
		result
	}

	private def getTables0() : List[Table[_]] = {
		return Arrays.asList[Table[_]](
			MeEnviprotect.ME_ENVIPROTECT,
			MeWeather.ME_WEATHER,
			TourBus.TOUR_BUS)
	}
}