package io.sast.demo.camera2;

import android.util.Size;
import java.util.Comparator;

class CompareSizeByArea implements Comparator<Size> {
    @Override
    public int compare(Size lhs, Size rhs) {
        return Long.signum((long) lhs.getWidth() * lhs.getHeight() - (long) rhs.getWidth() * rhs.getHeight());
    }
}
