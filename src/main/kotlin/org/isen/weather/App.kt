/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package org.isen.weather

import org.isen.weather.ctrl.MyWeatherDefaultCtrl
import org.isen.weather.model.IMyWeatherModel
import org.isen.weather.model.impl.DefaultMyWeatherModel
import org.isen.weather.view.IMyWeatherView
import org.isen.weather.view.impl.MySimpleView

fun main(args: Array<String>){
    val weatherModel: IMyWeatherModel = DefaultMyWeatherModel();
    val weatherController : MyWeatherDefaultCtrl = MyWeatherDefaultCtrl(weatherModel)
    val weatherView : IMyWeatherView = MySimpleView(weatherController,"Weather Kotlin App")
    weatherController.registerView(weatherView)
    weatherController.displayView()

}