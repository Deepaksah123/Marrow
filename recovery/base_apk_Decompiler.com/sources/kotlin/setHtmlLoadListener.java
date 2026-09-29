package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setHtmlLoadListener {
    static final LottieRatingBar[] IconCompatParcelizer = new LottieRatingBar[0];
    private boolean AudioAttributesCompatParcelizer;
    private LottieRatingBar[] read;
    private int write;

    public setHtmlLoadListener() {
        this(10);
    }

    public setHtmlLoadListener(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("'initialCapacity' must not be negative");
        }
        this.read = i == 0 ? IconCompatParcelizer : new LottieRatingBar[i];
        this.write = 0;
        this.AudioAttributesCompatParcelizer = false;
    }

    static LottieRatingBar[] write(LottieRatingBar[] lottieRatingBarArr) {
        return lottieRatingBarArr.length <= 0 ? IconCompatParcelizer : (LottieRatingBar[]) lottieRatingBarArr.clone();
    }

    private void IconCompatParcelizer(int i) {
        LottieRatingBar[] lottieRatingBarArr = new LottieRatingBar[Math.max(this.read.length, i + (i >> 1))];
        System.arraycopy(this.read, 0, lottieRatingBarArr, 0, this.write);
        this.read = lottieRatingBarArr;
        this.AudioAttributesCompatParcelizer = false;
    }

    public final void RemoteActionCompatParcelizer(LottieRatingBar lottieRatingBar) {
        if (lottieRatingBar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        int length = this.read.length;
        int i = this.write + 1;
        if (this.AudioAttributesCompatParcelizer | (i > length)) {
            IconCompatParcelizer(i);
        }
        this.read[this.write] = lottieRatingBar;
        this.write = i;
    }

    public final LottieRatingBar read(int i) {
        if (i < this.write) {
            return this.read[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" >= ");
        sb.append(this.write);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public final int RemoteActionCompatParcelizer() {
        return this.write;
    }

    final LottieRatingBar[] AudioAttributesCompatParcelizer() {
        int i = this.write;
        if (i == 0) {
            return IconCompatParcelizer;
        }
        LottieRatingBar[] lottieRatingBarArr = this.read;
        if (lottieRatingBarArr.length == i) {
            this.AudioAttributesCompatParcelizer = true;
            return lottieRatingBarArr;
        }
        LottieRatingBar[] lottieRatingBarArr2 = new LottieRatingBar[i];
        System.arraycopy(lottieRatingBarArr, 0, lottieRatingBarArr2, 0, i);
        return lottieRatingBarArr2;
    }
}
