package manager

import model.DoteModel
import utile.rMax
import data.Data

object ProcessingManager {
    fun processing(map : Array<Array<DoteModel>>, buf : Array<Array<Boolean>>) {
        var count = 0
        val size = Data.size
        for (x in map.indices) {
            for (y in map[1].indices) {
                count = 0
                for ( xo in -1..1 )
                    for ( yo in -1..1 )
                        if ( xo != 0 || yo != 0 )
                            if ( map[rMax(x+xo, size)]
                                    [rMax(y+yo, size)].dote.value ) count++

                buf[x][y] = when ( count ) {
                    2 -> map[x][y].dote.value
                    3 -> true
                    else -> false
                }
            }
        }
    }

}