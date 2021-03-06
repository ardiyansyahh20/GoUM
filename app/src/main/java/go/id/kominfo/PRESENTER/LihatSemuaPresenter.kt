package go.id.kominfo.PRESENTER


import com.google.gson.Gson
import go.id.kominfo.ApiRepository.ApiReposirtory
import go.id.kominfo.ApiRepository.PromoAPI
import go.id.kominfo.INTERFACE.LihatSemuaView
import go.id.kominfo.INTERFACE.MainView
import go.id.kominfo.POJO.ProdukResponse
import go.id.kominfo.POJO.bannerResponse
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class LihatSemuaPresenter(val view: LihatSemuaView, val gson: Gson, val apiReposirtory: ApiReposirtory){

    fun getPromo(){
       doAsync {
           val data =gson.fromJson(apiReposirtory.doRequest(PromoAPI.getPromo())
                   , ProdukResponse::class.java)
           uiThread {
               view.showData(data.data)

           }

       }
    }
    fun getFashion (){
        doAsync {
            val data =gson.fromJson(apiReposirtory.doRequest(PromoAPI.getFashion())
                    , ProdukResponse::class.java)
            uiThread {
                view.showData(data.data)

            }

        }
    }
    fun getCraft (){
        doAsync {
            val data =gson.fromJson(apiReposirtory.doRequest(PromoAPI.getCraft())
                    , ProdukResponse::class.java)
            uiThread {
                view.showData(data.data)

            }

        }
    }

    fun getKuliner (){
        doAsync {
            val data =gson.fromJson(apiReposirtory.doRequest(PromoAPI.getKuliner())
                    , ProdukResponse::class.java)
            uiThread {
                view.showData(data.data)

            }

        }
    }
//
//    fun getBenner (){
//        doAsync {
//            val data = gson.fromJson(apiReposirtory.doRequest(PromoAPI.getBenner())
//                    , bannerResponse::class.java)
//            uiThread {
//                view.showData(data.data)
//
//            }
//        }
//
//    }
    fun getMinuman (){
        doAsync {
            val data = gson.fromJson(apiReposirtory.doRequest(PromoAPI.getMinuman())
                    , ProdukResponse::class.java)
            uiThread {
                view.showData(data.data)

            }
        }

    }

    fun getRumahTangga (){
        doAsync {
            val data = gson.fromJson(apiReposirtory.doRequest(PromoAPI.getRumahTangga())
                    , ProdukResponse::class.java)
            uiThread {
                view.showData(data.data)

            }
        }

    }
//    fun getJasa (){
//        doAsync {
//            val data = gson.fromJson(apiReposirtory.doRequest(PromoAPI.getJasa())
//                    , bannerResponse::class.java)
//            uiThread {
//                view.showData(data.data)
//
//            }
//        }
//
//    }
//    fun getLainLain (){
//        doAsync {
//            val data = gson.fromJson(apiReposirtory.doRequest(PromoAPI.getJasa())
//                    , bannerResponse::class.java)
//            uiThread {
//                view.showData(data.data)
//
//            }
//        }
//
//    }

    fun getAllByABC(cari: String){
        doAsync {
            val data = gson.fromJson(apiReposirtory.doRequest(PromoAPI.getAllProduk(cari)),
                    ProdukResponse::class.java)
            uiThread {
                view.showData(data.data)
            }
        }
    }

}
