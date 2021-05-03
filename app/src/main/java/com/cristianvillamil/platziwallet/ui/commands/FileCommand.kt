package com.cristianvillamil.platziwallet.ui.commands

import android.content.Context

interface FileCommand {
    fun excute(context: Context, fileName: String, vararg  arguments: String)
}