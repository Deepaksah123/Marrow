package kotlin;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import kotlin.getFlacExtractorConstructor;

/* JADX INFO: loaded from: classes5.dex */
public interface getMidiExtractorConstructor extends getFlacExtractorConstructor.write {
    int IconCompatParcelizer();

    void RemoteActionCompatParcelizer();

    void read();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(read readVar);

    read write();

    public static class read {
        public float AudioAttributesCompatParcelizer;
        public float RemoteActionCompatParcelizer;
        public float write;

        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
        }

        public read(float f, float f2, float f3) {
            this.write = f;
            this.AudioAttributesCompatParcelizer = f2;
            this.RemoteActionCompatParcelizer = f3;
        }

        public read(read readVar) {
            this(readVar.write, readVar.AudioAttributesCompatParcelizer, readVar.RemoteActionCompatParcelizer);
        }

        public final void IconCompatParcelizer(float f, float f2, float f3) {
            this.write = f;
            this.AudioAttributesCompatParcelizer = f2;
            this.RemoteActionCompatParcelizer = f3;
        }

        public final void read(read readVar) {
            IconCompatParcelizer(readVar.write, readVar.AudioAttributesCompatParcelizer, readVar.RemoteActionCompatParcelizer);
        }

        public final boolean AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer == Float.MAX_VALUE;
        }
    }

    public static class IconCompatParcelizer extends Property<getMidiExtractorConstructor, read> {
        public static final Property<getMidiExtractorConstructor, read> AudioAttributesCompatParcelizer = new IconCompatParcelizer("circularReveal");

        @Override // android.util.Property
        public final /* synthetic */ read get(getMidiExtractorConstructor getmidiextractorconstructor) {
            return read(getmidiextractorconstructor);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(getMidiExtractorConstructor getmidiextractorconstructor, read readVar) {
            IconCompatParcelizer(getmidiextractorconstructor, readVar);
        }

        private IconCompatParcelizer(String str) {
            super(read.class, str);
        }

        private static read read(getMidiExtractorConstructor getmidiextractorconstructor) {
            return getmidiextractorconstructor.write();
        }

        private static void IconCompatParcelizer(getMidiExtractorConstructor getmidiextractorconstructor, read readVar) {
            getmidiextractorconstructor.setRevealInfo(readVar);
        }
    }

    public static class AudioAttributesCompatParcelizer implements TypeEvaluator<read> {
        public static final TypeEvaluator<read> RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer();
        private final read IconCompatParcelizer = new read((byte) 0);

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public read evaluate(float f, read readVar, read readVar2) {
            this.IconCompatParcelizer.IconCompatParcelizer(readVorbisCommentMetadataBlock.read(readVar.write, readVar2.write, f), readVorbisCommentMetadataBlock.read(readVar.AudioAttributesCompatParcelizer, readVar2.AudioAttributesCompatParcelizer, f), readVorbisCommentMetadataBlock.read(readVar.RemoteActionCompatParcelizer, readVar2.RemoteActionCompatParcelizer, f));
            return this.IconCompatParcelizer;
        }
    }

    public static class write extends Property<getMidiExtractorConstructor, Integer> {
        public static final Property<getMidiExtractorConstructor, Integer> read = new write("circularRevealScrimColor");

        @Override // android.util.Property
        public final /* synthetic */ Integer get(getMidiExtractorConstructor getmidiextractorconstructor) {
            return AudioAttributesCompatParcelizer(getmidiextractorconstructor);
        }

        @Override // android.util.Property
        public final /* synthetic */ void set(getMidiExtractorConstructor getmidiextractorconstructor, Integer num) {
            IconCompatParcelizer(getmidiextractorconstructor, num);
        }

        private write(String str) {
            super(Integer.class, str);
        }

        private static Integer AudioAttributesCompatParcelizer(getMidiExtractorConstructor getmidiextractorconstructor) {
            return Integer.valueOf(getmidiextractorconstructor.IconCompatParcelizer());
        }

        private static void IconCompatParcelizer(getMidiExtractorConstructor getmidiextractorconstructor, Integer num) {
            getmidiextractorconstructor.setCircularRevealScrimColor(num.intValue());
        }
    }
}
