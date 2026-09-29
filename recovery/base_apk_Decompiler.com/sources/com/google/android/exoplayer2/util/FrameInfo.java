package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class FrameInfo {
    public final int height;
    public final long offsetToAddUs;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static final class Builder {
        private int height;
        private long offsetToAddUs;
        private float pixelWidthHeightRatio;
        private int width;

        public Builder(int i, int i2) {
            this.width = i;
            this.height = i2;
            this.pixelWidthHeightRatio = 1.0f;
        }

        public Builder(FrameInfo frameInfo) {
            this.width = frameInfo.width;
            this.height = frameInfo.height;
            this.pixelWidthHeightRatio = frameInfo.pixelWidthHeightRatio;
            this.offsetToAddUs = frameInfo.offsetToAddUs;
        }

        public final Builder setWidth(int i) {
            this.width = i;
            return this;
        }

        public final Builder setHeight(int i) {
            this.height = i;
            return this;
        }

        public final Builder setPixelWidthHeightRatio(float f) {
            this.pixelWidthHeightRatio = f;
            return this;
        }

        public final Builder setOffsetToAddUs(long j) {
            this.offsetToAddUs = j;
            return this;
        }

        public final FrameInfo build() {
            return new FrameInfo(this.width, this.height, this.pixelWidthHeightRatio, this.offsetToAddUs);
        }
    }

    private FrameInfo(int i, int i2, float f, long j) {
        Assertions.checkArgument(i > 0, "width must be positive, but is: ".concat(String.valueOf(i)));
        Assertions.checkArgument(i2 > 0, "height must be positive, but is: ".concat(String.valueOf(i2)));
        this.width = i;
        this.height = i2;
        this.pixelWidthHeightRatio = f;
        this.offsetToAddUs = j;
    }
}
