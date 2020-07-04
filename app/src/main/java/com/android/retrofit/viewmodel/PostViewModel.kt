package com.android.retrofit.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.retrofit.entity.Post
import com.android.retrofit.repo.PostRepo
import kotlinx.coroutines.*

class PostViewModel : ViewModel() {
    lateinit var job: Job
    var coroutineMainScope: CoroutineScope = CoroutineScope(Dispatchers.Main);
    var coroutineIOScope: CoroutineScope = CoroutineScope(Dispatchers.IO);
    var livePostData: MutableLiveData<List<Post>> = MutableLiveData()


    fun getPosts() {
        job = coroutineIOScope.launch {
            val post = PostRepo().getPosts()
            withContext(Dispatchers.Main) {
                livePostData.value = post
            }

        }
    }
}