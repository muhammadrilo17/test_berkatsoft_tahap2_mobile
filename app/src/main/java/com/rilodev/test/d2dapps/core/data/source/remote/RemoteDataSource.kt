package com.rilodev.test.d2dapps.core.data.source.remote

import com.rilodev.test.d2dapps.core.data.source.remote.firebase.FirebaseService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RemoteDataSource @Inject constructor(private val firebaseService: FirebaseService) {
//
//    suspend fun getAllTourism(): Flow<ApiResponse<List<TourismResponse>>> {
//        //get data from remote api
//        return flow {
//            try {
//                val response = apiService.getList()
//                val dataArray = response.places
//                if (dataArray.isNotEmpty()){
//                    emit(ApiResponse.Success(response.places))
//                } else {
//                    emit(ApiResponse.Empty)
//                }
//            } catch (e : Exception){
//                emit(ApiResponse.Error(e.toString()))
//                Log.e("RemoteDataSource", e.toString())
//            }
//        }.flowOn(Dispatchers.IO)
//    }
}