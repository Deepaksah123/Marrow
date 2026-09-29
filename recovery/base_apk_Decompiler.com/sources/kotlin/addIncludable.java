package kotlin;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00198G¢\u0006\u0006\u001a\u0004\b\u0016\u0010 R\u0011\u0010!\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\"\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f"}, d2 = {"Lo/addIncludable;", "", "", "p0", "Landroid/text/TextPaint;", "p1", "", "p2", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "", "IconCompatParcelizer", "()F", "read", "RemoteActionCompatParcelizer", "(II)F", "MediaBrowserCompatItemReceiver", "Ljava/lang/CharSequence;", "AudioAttributesImplApi26Parcelizer", "Landroid/text/TextPaint;", "AudioAttributesImplApi21Parcelizer", "I", "AudioAttributesCompatParcelizer", "F", "write", "Landroid/text/BoringLayout$Metrics;", "Landroid/text/BoringLayout$Metrics;", "", "Z", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/lang/CharSequence;", "()Landroid/text/BoringLayout$Metrics;", "RatingCompat", "MediaBrowserCompatSearchResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class addIncludable {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final TextPaint RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private BoringLayout.Metrics MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final CharSequence IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private CharSequence AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private float write = Float.NaN;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float AudioAttributesCompatParcelizer = Float.NaN;

    public addIncludable(CharSequence charSequence, TextPaint textPaint, int i) {
        this.IconCompatParcelizer = charSequence;
        this.RemoteActionCompatParcelizer = textPaint;
        this.read = i;
    }

    private final CharSequence MediaBrowserCompatCustomActionResultReceiver() {
        CharSequence charSequence = this.AudioAttributesImplBaseParcelizer;
        if (charSequence == null) {
            if (getAnySetter.AudioAttributesCompatParcelizer) {
                CharSequence charSequenceRemoteActionCompatParcelizer = getAnySetter.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
                this.AudioAttributesImplBaseParcelizer = charSequenceRemoteActionCompatParcelizer;
                return charSequenceRemoteActionCompatParcelizer;
            }
            return this.IconCompatParcelizer;
        }
        toMagicModuleMetaRepoModel.write(charSequence);
        return charSequence;
    }

    public final BoringLayout.Metrics AudioAttributesCompatParcelizer() {
        if (!this.AudioAttributesImplApi26Parcelizer) {
            this.MediaBrowserCompatItemReceiver = BeanDeserializerBuilder.INSTANCE.RemoteActionCompatParcelizer(this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, _validateSubType.AudioAttributesCompatParcelizer(this.read));
            this.AudioAttributesImplApi26Parcelizer = true;
        }
        return this.MediaBrowserCompatItemReceiver;
    }

    public final float write() {
        if (!Float.isNaN(this.AudioAttributesCompatParcelizer)) {
            return this.AudioAttributesCompatParcelizer;
        }
        float fIconCompatParcelizer = IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer = fIconCompatParcelizer;
        return fIconCompatParcelizer;
    }

    private final float IconCompatParcelizer() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.RemoteActionCompatParcelizer.getTextLocale());
        CharSequence charSequence = this.IconCompatParcelizer;
        int i = 0;
        lineInstance.setText(new addBackReferenceProperty(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: o.buildBuilderBased
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return addIncludable.read((Pair) obj, (Pair) obj2);
            }
        });
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.IconCompatParcelizer()).intValue() - ((Number) pair.write()).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        if (priorityQueue.isEmpty()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Pair pair2 = (Pair) it.next();
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(((Number) pair2.RemoteActionCompatParcelizer()).intValue(), ((Number) pair2.read()).intValue());
        while (it.hasNext()) {
            Pair pair3 = (Pair) it.next();
            fRemoteActionCompatParcelizer = Math.max(fRemoteActionCompatParcelizer, RemoteActionCompatParcelizer(((Number) pair3.RemoteActionCompatParcelizer()).intValue(), ((Number) pair3.read()).intValue()));
        }
        return fRemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int read(Pair pair, Pair pair2) {
        return (((Number) pair.IconCompatParcelizer()).intValue() - ((Number) pair.write()).intValue()) - (((Number) pair2.IconCompatParcelizer()).intValue() - ((Number) pair2.write()).intValue());
    }

    public final float RemoteActionCompatParcelizer() {
        if (!Float.isNaN(this.write)) {
            return this.write;
        }
        float f = read();
        this.write = f;
        return f;
    }

    private final float read() {
        BoringLayout.Metrics metricsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        float fCeil = metricsAudioAttributesCompatParcelizer != null ? metricsAudioAttributesCompatParcelizer.width : -1;
        if (fCeil < BitmapDescriptorFactory.HUE_RED) {
            fCeil = (float) Math.ceil(RemoteActionCompatParcelizer$default(this, 0, 0, 3, null));
        }
        return getAnySetter.RemoteActionCompatParcelizer(fCeil, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer) ? fCeil + 0.5f : fCeil;
    }

    static /* synthetic */ float RemoteActionCompatParcelizer$default(addIncludable addincludable, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = addincludable.MediaBrowserCompatCustomActionResultReceiver().length();
        }
        return addincludable.RemoteActionCompatParcelizer(i, i2);
    }

    private final float RemoteActionCompatParcelizer(int p0, int p1) {
        return Layout.getDesiredWidth(MediaBrowserCompatCustomActionResultReceiver(), p0, p1, this.RemoteActionCompatParcelizer);
    }
}
