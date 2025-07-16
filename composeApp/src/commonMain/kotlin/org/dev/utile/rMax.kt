package utile


fun rMax(i: Int, max: Int) =
    when {
        i >= max -> 0
        i < 0 -> max-1
        else -> i
    }
