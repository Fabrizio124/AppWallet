package com.cristianvillamil.platziwallet.ui

class TranferFacade {
    val analyticsManager: AnalyticsManger = AnalyticsManger()
    val securityManager = SecurityManager()
     val transferManager : TransferManager = TransferManager()

    fun tranfer(){
       val token = securityManager.getToken()
        analyticsManager.registerTransfer(token)
        transferManager.tranfer(token)
    }
}