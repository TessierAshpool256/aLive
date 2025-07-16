package utile

import model.DoteModel


fun copyM(map : Array<Array<DoteModel>>, buf : Array<Array<Boolean>>) {
    for (x in map.indices) {
        for (y in map[1].indices) {
            map[x][y].setDote(buf[x][y])
        }
    }
}
