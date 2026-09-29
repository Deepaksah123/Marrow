package kotlin;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\f\u0010\u000f\u001a\u0017\u0010\u0001\u001a\u00020\u0010*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0001\u0010\u0011\u001a\u001f\u0010\u0012\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0006\u001a\u00020\u0014*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0006\u0010\u0015\u001a\u001f\u0010\u0012\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0012\u0010\u0016\u001a\u001f\u0010\u0006\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0006\u0010\r\u001a\u0017\u0010\u0018\u001a\u00020\u0010*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0011\u001a\u001f\u0010\f\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\f\u0010\u0013\u001a\u0017\u0010\u0012\u001a\u00020\u0019*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u0012\u0010\u001a\u001a\u001f\u0010\u0004\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u0004\u0010\r\u001a\u0017\u0010\u001c\u001a\u00020\u001b*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u001f\u0010\u0001\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u0001\u0010\r\u001a\u0017\u0010\u001d\u001a\u00020\u0010*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\u001d\u0010\u0011\u001a\u001f\u0010\u0001\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0001\u0010\u0013\u001a\u0017\u0010\f\u001a\u00020\u001e*\u00060\u0003j\u0002`\bH\u0000¢\u0006\u0004\b\f\u0010\u001a\u001a\u001f\u0010\u0012\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u0006\u0010\n\u001a\u00020\u001eH\u0000¢\u0006\u0004\b\u0012\u0010\r\u001a'\u0010\u0006\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\u000e\u0010\n\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` H\u0000¢\u0006\u0004\b\u0006\u0010!\u001a!\u0010\u0004\u001a\u00020\u000b*\u00060\u0003j\u0002`\b2\b\u0010\n\u001a\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b\u0004\u0010#*\n\u0010\u0012\"\u00020\u00032\u00020\u0003"}, d2 = {"Lo/releaseBuffers;", "AudioAttributesCompatParcelizer", "()Lo/releaseBuffers;", "Landroid/graphics/Paint;", "RemoteActionCompatParcelizer", "(Landroid/graphics/Paint;)Lo/releaseBuffers;", "read", "()Landroid/graphics/Paint;", "Lo/IconCompatParcelizer;", "Lo/createInstance;", "p0", "", "write", "(Landroid/graphics/Paint;I)V", "Lo/switchAndReturnNext;", "(Landroid/graphics/Paint;Lo/switchAndReturnNext;)V", "", "(Landroid/graphics/Paint;)F", "IconCompatParcelizer", "(Landroid/graphics/Paint;F)V", "Lo/switchToNext;", "(Landroid/graphics/Paint;)J", "(Landroid/graphics/Paint;J)V", "Lo/ThreadLocalBufferManager;", "AudioAttributesImplBaseParcelizer", "Lo/findAutoDetectVisibility;", "(Landroid/graphics/Paint;)I", "Lo/findCreatorBinding;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/TextBuffer;", "Landroid/graphics/Shader;", "Lo/AudioAttributesCompatParcelizer;", "(Landroid/graphics/Paint;Landroid/graphics/Shader;)V", "Lo/setCurrentLength;", "(Landroid/graphics/Paint;Lo/setCurrentLength;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class fromInitial {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            write = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            AudioAttributesCompatParcelizer = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            RemoteActionCompatParcelizer = iArr3;
        }
    }

    public static final releaseBuffers AudioAttributesCompatParcelizer() {
        return new appendTwoBytes();
    }

    public static final releaseBuffers RemoteActionCompatParcelizer(Paint paint) {
        return new appendTwoBytes(paint);
    }

    public static final Paint read() {
        return new Paint(7);
    }

    public static final void write(Paint paint, int i) {
        findDeserializer.INSTANCE.AudioAttributesCompatParcelizer(paint, i);
    }

    public static final void write(Paint paint, switchAndReturnNext switchandreturnnext) {
        paint.setColorFilter(switchandreturnnext != null ? releaseCharBuffer.RemoteActionCompatParcelizer(switchandreturnnext) : null);
    }

    public static final float AudioAttributesCompatParcelizer(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final void IconCompatParcelizer(Paint paint, float f) {
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final long read(Paint paint) {
        return RequestPayload.AudioAttributesCompatParcelizer(paint.getColor());
    }

    public static final void IconCompatParcelizer(Paint paint, long j) {
        paint.setColor(RequestPayload.IconCompatParcelizer(j));
    }

    public static final void read(Paint paint, int i) {
        paint.setStyle(ThreadLocalBufferManager.IconCompatParcelizer(i, ThreadLocalBufferManager.INSTANCE.write()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public static final float AudioAttributesImplBaseParcelizer(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final void write(Paint paint, float f) {
        paint.setStrokeWidth(f);
    }

    public static final int IconCompatParcelizer(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : WhenMappings.AudioAttributesCompatParcelizer[strokeCap.ordinal()];
        if (i == 1) {
            return findAutoDetectVisibility.INSTANCE.read();
        }
        if (i == 2) {
            return findAutoDetectVisibility.INSTANCE.RemoteActionCompatParcelizer();
        }
        if (i == 3) {
            return findAutoDetectVisibility.INSTANCE.IconCompatParcelizer();
        }
        return findAutoDetectVisibility.INSTANCE.read();
    }

    public static final void RemoteActionCompatParcelizer(Paint paint, int i) {
        Paint.Cap cap;
        if (findAutoDetectVisibility.AudioAttributesCompatParcelizer(i, findAutoDetectVisibility.INSTANCE.IconCompatParcelizer())) {
            cap = Paint.Cap.SQUARE;
        } else if (findAutoDetectVisibility.AudioAttributesCompatParcelizer(i, findAutoDetectVisibility.INSTANCE.RemoteActionCompatParcelizer())) {
            cap = Paint.Cap.ROUND;
        } else {
            findAutoDetectVisibility.AudioAttributesCompatParcelizer(i, findAutoDetectVisibility.INSTANCE.read());
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    public static final int AudioAttributesImplApi26Parcelizer(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : WhenMappings.RemoteActionCompatParcelizer[strokeJoin.ordinal()];
        if (i == 1) {
            return findCreatorBinding.INSTANCE.RemoteActionCompatParcelizer();
        }
        if (i == 2) {
            return findCreatorBinding.INSTANCE.read();
        }
        if (i == 3) {
            return findCreatorBinding.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return findCreatorBinding.INSTANCE.RemoteActionCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AudioAttributesCompatParcelizer(android.graphics.Paint r1, int r2) {
        /*
            o.findCreatorBinding$AudioAttributesCompatParcelizer r0 = kotlin.findCreatorBinding.INSTANCE
            int r0 = r0.RemoteActionCompatParcelizer()
            boolean r0 = kotlin.findCreatorBinding.IconCompatParcelizer(r2, r0)
            if (r0 != 0) goto L2a
            o.findCreatorBinding$AudioAttributesCompatParcelizer r0 = kotlin.findCreatorBinding.INSTANCE
            int r0 = r0.read()
            boolean r0 = kotlin.findCreatorBinding.IconCompatParcelizer(r2, r0)
            if (r0 == 0) goto L1b
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.BEVEL
            goto L2c
        L1b:
            o.findCreatorBinding$AudioAttributesCompatParcelizer r0 = kotlin.findCreatorBinding.INSTANCE
            int r0 = r0.AudioAttributesCompatParcelizer()
            boolean r2 = kotlin.findCreatorBinding.IconCompatParcelizer(r2, r0)
            if (r2 == 0) goto L2a
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.ROUND
            goto L2c
        L2a:
            android.graphics.Paint$Join r2 = android.graphics.Paint.Join.MITER
        L2c:
            r1.setStrokeJoin(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromInitial.AudioAttributesCompatParcelizer(android.graphics.Paint, int):void");
    }

    public static final float MediaBrowserCompatCustomActionResultReceiver(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final void AudioAttributesCompatParcelizer(Paint paint, float f) {
        paint.setStrokeMiter(f);
    }

    public static final int write(Paint paint) {
        if (!paint.isFilterBitmap()) {
            return TextBuffer.INSTANCE.read();
        }
        return TextBuffer.INSTANCE.write();
    }

    public static final void IconCompatParcelizer(Paint paint, int i) {
        paint.setFilterBitmap(!TextBuffer.read(i, TextBuffer.INSTANCE.read()));
    }

    public static final void read(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void RemoteActionCompatParcelizer(Paint paint, setCurrentLength setcurrentlength) {
        finishCurrentSegment finishcurrentsegment = (finishCurrentSegment) setcurrentlength;
        paint.setPathEffect(finishcurrentsegment != null ? finishcurrentsegment.getIconCompatParcelizer() : null);
    }
}
