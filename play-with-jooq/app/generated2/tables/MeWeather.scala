/**
 * This class is generated by jOOQ
 */
package generated2.tables


import generated2.Keys
import generated2.Tour
import generated2.tables.records.MeWeatherRecord

import java.lang.Class
import java.lang.Integer
import java.lang.String
import java.sql.Timestamp
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl


object MeWeather {

	/**
	 * The reference instance of <code>tour.ME_WEATHER</code>
	 */
	val ME_WEATHER = new MeWeather
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
class MeWeather(alias : String, aliased : Table[MeWeatherRecord], parameters : Array[ Field[_] ]) extends TableImpl[MeWeatherRecord](alias, Tour.TOUR, aliased, parameters, "") {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[MeWeatherRecord] = {
		classOf[MeWeatherRecord]
	}

	/**
	 * The column <code>tour.ME_WEATHER.ID</code>. info:天气 ID
	 */
	val ID : TableField[MeWeatherRecord, String] = createField("ID", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), "info:天气 ID")

	/**
	 * The column <code>tour.ME_WEATHER.REGION</code>. info:天气 地区编码
	 */
	val REGION : TableField[MeWeatherRecord, Integer] = createField("REGION", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), "info:天气 地区编码")

	/**
	 * The column <code>tour.ME_WEATHER.WT</code>. info:天气 天气现象
	 */
	val WT : TableField[MeWeatherRecord, String] = createField("WT", org.jooq.impl.SQLDataType.VARCHAR.length(30), "info:天气 天气现象")

	/**
	 * The column <code>tour.ME_WEATHER.FH</code>. info:天气 预报时次
	 */
	val FH : TableField[MeWeatherRecord, Integer] = createField("FH", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), "info:天气 预报时次")

	/**
	 * The column <code>tour.ME_WEATHER.T1</code>. info:天气 晚上温度
	 */
	val T1 : TableField[MeWeatherRecord, Integer] = createField("T1", org.jooq.impl.SQLDataType.INTEGER, "info:天气 晚上温度")

	/**
	 * The column <code>tour.ME_WEATHER.T2</code>. info:天气 白天温度
	 */
	val T2 : TableField[MeWeatherRecord, Integer] = createField("T2", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), "info:天气 白天温度")

	/**
	 * The column <code>tour.ME_WEATHER.WIND</code>. info:天气 风向
	 */
	val WIND : TableField[MeWeatherRecord, String] = createField("WIND", org.jooq.impl.SQLDataType.VARCHAR.length(18), "info:天气 风向")

	/**
	 * The column <code>tour.ME_WEATHER.TIME</code>. info:天气 时间
	 */
	val TIME : TableField[MeWeatherRecord, Timestamp] = createField("TIME", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), "info:天气 时间")

	/**
	 * The column <code>tour.ME_WEATHER.W1</code>. info:天气 晚上天气现象代码
	 */
	val W1 : TableField[MeWeatherRecord, Integer] = createField("W1", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), "info:天气 晚上天气现象代码")

	/**
	 * The column <code>tour.ME_WEATHER.W2</code>. info:天气 白天天气现象代码
	 */
	val W2 : TableField[MeWeatherRecord, Integer] = createField("W2", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), "info:天气 白天天气现象代码")

	/**
	 * The column <code>tour.ME_WEATHER.RESOURCECODE</code>. info:天气 资源编码
	 */
	val RESOURCECODE : TableField[MeWeatherRecord, String] = createField("RESOURCECODE", org.jooq.impl.SQLDataType.VARCHAR.length(12).defaulted(true), "info:天气 资源编码")

	/**
	 * Create a <code>tour.ME_WEATHER</code> table reference
	 */
	def this() = {
		this("ME_WEATHER", null, null)
	}

	/**
	 * Create an aliased <code>tour.ME_WEATHER</code> table reference
	 */
	def this(alias : String) = {
		this(alias, generated2.tables.MeWeather.ME_WEATHER, null)
	}

	private def this(alias : String, aliased : Table[MeWeatherRecord]) = {
		this(alias, aliased, null)
	}

	override def getPrimaryKey : UniqueKey[MeWeatherRecord] = {
		Keys.KEY_ME_WEATHER_PRIMARY
	}

	override def getKeys : List[ UniqueKey[MeWeatherRecord] ] = {
		return Arrays.asList[ UniqueKey[MeWeatherRecord] ](Keys.KEY_ME_WEATHER_PRIMARY)
	}

	override def as(alias : String) : MeWeather = {
		new MeWeather(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : MeWeather = {
		new MeWeather(name, null)
	}
}