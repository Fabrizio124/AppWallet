package com.cristianvillamil.platziwallet.ui.observable

class AvailableBalanceObservable : Observable {
    private val amountObserverList: ArrayList<Observer> = arrayListOf()
    private var amount: Double = 0.0

    fun changeAmount(newValue: Double){
        amount = newValue
        notifyObervers(amount)
    }

    override fun addObserver(observer: Observer) {
         amountObserverList.add(observer)
    }

    override fun removeObserver(observer: Observer) {
          amountObserverList.remove(observer)
    }

    override fun notifyObervers(newValue: Double) {
        amountObserverList.forEach {
            it.notifyChange(newValue)
        }
    }
}