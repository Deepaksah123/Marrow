package kotlin;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.setAllRendererStreamsFinal;

/* JADX INFO: loaded from: classes2.dex */
public final class onVideoInputFormatChanged implements ExoPlayerImplComponentListenerExternalSyntheticLambda0, onVideoSurfaceCreated {
    private final String RemoteActionCompatParcelizer;
    private final setAllRendererStreamsFinal read;
    private final Path AudioAttributesCompatParcelizer = new Path();
    private final Path MediaBrowserCompatCustomActionResultReceiver = new Path();
    private final Path write = new Path();
    private final List<ExoPlayerImplComponentListenerExternalSyntheticLambda0> IconCompatParcelizer = new ArrayList();

    public onVideoInputFormatChanged(setAllRendererStreamsFinal setallrendererstreamsfinal) {
        this.RemoteActionCompatParcelizer = setallrendererstreamsfinal.AudioAttributesCompatParcelizer();
        this.read = setallrendererstreamsfinal;
    }

    @Override // kotlin.onVideoSurfaceCreated
    public final void AudioAttributesCompatParcelizer(ListIterator<onVideoFrameProcessingOffset> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            onVideoFrameProcessingOffset onvideoframeprocessingoffsetPrevious = listIterator.previous();
            if (onvideoframeprocessingoffsetPrevious instanceof ExoPlayerImplComponentListenerExternalSyntheticLambda0) {
                this.IconCompatParcelizer.add((ExoPlayerImplComponentListenerExternalSyntheticLambda0) onvideoframeprocessingoffsetPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final void write(List<onVideoFrameProcessingOffset> list, List<onVideoFrameProcessingOffset> list2) {
        for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
            this.IconCompatParcelizer.get(i).write(list, list2);
        }
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda0
    public final Path write() {
        this.write.reset();
        if (this.read.read()) {
            return this.write;
        }
        int i = AnonymousClass5.IconCompatParcelizer[this.read.RemoteActionCompatParcelizer().ordinal()];
        if (i == 1) {
            RemoteActionCompatParcelizer();
        } else if (i == 2) {
            IconCompatParcelizer(Path.Op.UNION);
        } else if (i == 3) {
            IconCompatParcelizer(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            IconCompatParcelizer(Path.Op.INTERSECT);
        } else if (i == 5) {
            IconCompatParcelizer(Path.Op.XOR);
        }
        return this.write;
    }

    /* JADX INFO: renamed from: o.onVideoInputFormatChanged$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[setAllRendererStreamsFinal.RemoteActionCompatParcelizer.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[setAllRendererStreamsFinal.RemoteActionCompatParcelizer.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[setAllRendererStreamsFinal.RemoteActionCompatParcelizer.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IconCompatParcelizer[setAllRendererStreamsFinal.RemoteActionCompatParcelizer.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IconCompatParcelizer[setAllRendererStreamsFinal.RemoteActionCompatParcelizer.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                IconCompatParcelizer[setAllRendererStreamsFinal.RemoteActionCompatParcelizer.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    private void RemoteActionCompatParcelizer() {
        for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
            this.write.addPath(this.IconCompatParcelizer.get(i).write());
        }
    }

    private void IconCompatParcelizer(Path.Op op) {
        this.MediaBrowserCompatCustomActionResultReceiver.reset();
        this.AudioAttributesCompatParcelizer.reset();
        for (int size = this.IconCompatParcelizer.size() - 1; size > 0; size--) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda0 = this.IconCompatParcelizer.get(size);
            if (exoPlayerImplComponentListenerExternalSyntheticLambda0 instanceof onVideoDecoderInitialized) {
                onVideoDecoderInitialized onvideodecoderinitialized = (onVideoDecoderInitialized) exoPlayerImplComponentListenerExternalSyntheticLambda0;
                List<ExoPlayerImplComponentListenerExternalSyntheticLambda0> list = onvideodecoderinitialized.read();
                for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                    Path pathWrite = list.get(size2).write();
                    pathWrite.transform(onvideodecoderinitialized.AudioAttributesImplApi26Parcelizer());
                    this.MediaBrowserCompatCustomActionResultReceiver.addPath(pathWrite);
                }
            } else {
                this.MediaBrowserCompatCustomActionResultReceiver.addPath(exoPlayerImplComponentListenerExternalSyntheticLambda0.write());
            }
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda0 exoPlayerImplComponentListenerExternalSyntheticLambda02 = this.IconCompatParcelizer.get(0);
        if (exoPlayerImplComponentListenerExternalSyntheticLambda02 instanceof onVideoDecoderInitialized) {
            onVideoDecoderInitialized onvideodecoderinitialized2 = (onVideoDecoderInitialized) exoPlayerImplComponentListenerExternalSyntheticLambda02;
            List<ExoPlayerImplComponentListenerExternalSyntheticLambda0> list2 = onvideodecoderinitialized2.read();
            for (int i = 0; i < list2.size(); i++) {
                Path pathWrite2 = list2.get(i).write();
                pathWrite2.transform(onvideodecoderinitialized2.AudioAttributesImplApi26Parcelizer());
                this.AudioAttributesCompatParcelizer.addPath(pathWrite2);
            }
        } else {
            this.AudioAttributesCompatParcelizer.set(exoPlayerImplComponentListenerExternalSyntheticLambda02.write());
        }
        this.write.op(this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver, op);
    }
}
