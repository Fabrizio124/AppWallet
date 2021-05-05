package com.cristianvillamil.platziwallet.ui.commands

import android.content.Context
import android.util.Log
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

class ReadCommand : FileCommand {
    override fun excute(context: Context, fileName: String, vararg arguments: String) {
       var fileString = ""
        val  inputStream =  context.openFileInput(fileName)
        val stringBuilder = StringBuilder()
        val inputStreamReader = InputStreamReader(inputStream)
        val bufferedReader = BufferedReader(inputStreamReader)
        bufferedReader.forEachLine { stringBuilder.append("\n").append(it) }
        fileString = stringBuilder.toString()
        Log.e("ReadedFile",fileString)
     }
}