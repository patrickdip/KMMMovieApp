package com.dipumba.movies.util

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

internal class AndroidDispatcher: Dispatcher{
    override val io: CoroutineDispatcher
        get() = Dispatchers.IO
}

internal actual fun provideDispatcher(): Dispatcher = AndroidDispatcher()