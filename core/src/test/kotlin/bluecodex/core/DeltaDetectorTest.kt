package bluecodex.core

import kotlin.test.Test
import kotlin.test.assertTrue

class DeltaDetectorTest {
    private val detector = DeltaDetector()

    @Test
    fun detectsNewWhenNoPreviousCid() {
        val post = Post("uri", "cid1")
        assertTrue(detector.detect(null, post) is Delta.New)
    }
}
