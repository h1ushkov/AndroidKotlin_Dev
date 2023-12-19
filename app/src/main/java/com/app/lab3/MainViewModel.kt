package com.app.lab3

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.app.lab3.model.Parts

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private var _myList: MutableLiveData<List<Parts>> =
        MutableLiveData<List<Parts>>().apply {
            value = emptyList()
        }
    val myList: LiveData<List<Parts>> = _myList

    private val studentsList =
        listOf<Parts>(
            Parts("Brake Support", "VIN133366644443322", "2000", "1337", "Ford"),
            Parts("Front Wheel", "VIN54323423412331334", "2000", "12000", "BMW"),
            Parts("Engine Oil Filter", "VIN9876543210123456", "2021", "25", "Chevrolet"),
            Parts("Rearview Mirror", "VIN1111222233334444", "2015", "300", "Toyota"),
            Parts("Air Filter", "VIN5555666677778888", "2010", "50", "Honda"),
            Parts("Spark Plugs", "VIN9999000011112222", "2018", "15", "Nissan"),
            Parts("Transmission Fluid", "VIN8888777766665555", "2014", "80", "Mercedes"),
            Parts("Radiator Fan", "VIN1234123412345678", "2012", "200", "Volkswagen")
        )
    init{
        _myList.value = studentsList
    }
}