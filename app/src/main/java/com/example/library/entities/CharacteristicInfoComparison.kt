package com.example.library.entities

fun getLargestCharacteristicList():Institution{
    var max:Int=-9
    var maxCharacteristicInstitution:Institution=ComparisonList.comparisonList!!.elementAt(0)
    for(item in ComparisonList.comparisonList!!) {// тогда нужно гарантировать что список не null
        if(item.characteristicList.size>max){
            max=item.characteristicList.size
            maxCharacteristicInstitution=item
        }
    }
    return maxCharacteristicInstitution
}
fun getInstitutionCharacteristic(characteristic: Characteristic):MutableList<InstitutionsCharacteristic> {
    val a: MutableList<InstitutionsCharacteristic> = mutableListOf(InstitutionsCharacteristic("",""))
    a.clear()
    here@ for(item in ComparisonList.comparisonList!!) {
        var flag = false
        for (item1 in item.characteristicList) {
            if (item1.characteristicname.equals(characteristic.characteristicname)) {
                a.add(InstitutionsCharacteristic(item.title,item1.characteristic))
                flag=true
                continue@here
            }
        }
        if (!flag)
            a.add(InstitutionsCharacteristic(item.title,""))
    }
    return a
}

