package kotlin;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.find;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b!\u0010 J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\"\u0010 J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b#\u0010 J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b$\u0010 J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b%\u0010 J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b&\u0010 J\u0015\u0010'\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b)\u0010(J\u0015\u0010*\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b*\u0010(J\u0015\u0010+\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b+\u0010(J\u0015\u0010,\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b,\u0010(J\u0015\u0010-\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b-\u0010(J\u001d\u0010,\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b,\u0010.J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b$\u0010/J\u001f\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b+\u0010/J\u0015\u00100\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b0\u0010(J\u0015\u00101\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b3\u0010(J%\u0010,\u001a\u0002052\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u000204¢\u0006\u0004\b,\u00106J9\u0010+\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0003\u001a\u0002072\u0006\u0010\u0005\u001a\u00020\b2\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u000f08¢\u0006\u0004\b+\u00109J\u001f\u0010+\u001a\u0002052\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020:H\u0000¢\u0006\u0004\b+\u0010;J-\u0010<\u001a\u0002052\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020:2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b<\u0010=J\u0015\u0010<\u001a\u0002072\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b<\u0010>J\u0015\u0010%\u001a\u0002052\u0006\u0010\u0003\u001a\u00020?¢\u0006\u0004\b%\u0010@J\u000f\u00100\u001a\u00020\u000fH\u0000¢\u0006\u0004\b0\u0010AR\u0017\u0010$\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b1\u0010B\u001a\u0004\b&\u0010CR\u0016\u0010,\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010DR\u001a\u0010+\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010E\u001a\u0004\b<\u0010AR\u001a\u0010<\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010E\u001a\u0004\b$\u0010AR\u0014\u0010%\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010FR\u001a\u0010!\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010E\u001a\u0004\b+\u0010AR\u0018\u0010&\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010HR\u0011\u00100\u001a\u00020G8G¢\u0006\u0006\u001a\u0004\b)\u0010IR\u001a\u0010-\u001a\u00020J8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010K\u001a\u0004\b,\u0010LR\u001a\u0010)\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010M\u001a\u0004\b!\u0010NR\u0014\u0010\"\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010MR\u0014\u0010*\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010MR\u0014\u00103\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010OR\u0014\u0010'\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bP\u0010OR\u0014\u0010#\u001a\u00020\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010ER\u0016\u0010S\u001a\u0004\u0018\u00010Q8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010RR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010MR\u001c\u0010P\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010T8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010VR\u0014\u00101\u001a\u00020W8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010X\u001a\u0004\u0018\u00010Z8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010[R\u0014\u0010]\u001a\u00020Z8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\\R\u0011\u0010_\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b-\u0010^R\u0011\u0010`\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b%\u0010N"}, d2 = {"Lo/addInjectables;", "", "", "p0", "", "p1", "Landroid/text/TextPaint;", "p2", "", "p3", "Landroid/text/TextUtils$TruncateAt;", "p4", "p5", "p6", "p7", "", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "", "p16", "p17", "Lo/addIncludable;", "p18", "<init>", "(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILo/addIncludable;)V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "(I)F", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "read", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "RatingCompat", "(I)I", "AudioAttributesImplBaseParcelizer", "MediaDescriptionCompat", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "(IF)I", "(IZ)F", "MediaBrowserCompatCustomActionResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "(I)Z", "MediaBrowserCompatMediaItem", "Landroid/graphics/Path;", "", "(IILandroid/graphics/Path;)V", "Landroid/graphics/RectF;", "Lkotlin/Function2;", "(Landroid/graphics/RectF;ILo/MagicModuleSubmissionRequestBody;)[I", "", "(I[F)V", "write", "(II[FI)V", "(I)Landroid/graphics/RectF;", "Landroid/graphics/Canvas;", "(Landroid/graphics/Canvas;)V", "()Z", "Landroid/text/TextPaint;", "()Landroid/text/TextPaint;", "Landroid/text/TextUtils$TruncateAt;", "Z", "Lo/addIncludable;", "Lo/constructSetterlessProperty;", "Lo/constructSetterlessProperty;", "()Lo/constructSetterlessProperty;", "Landroid/text/Layout;", "Landroid/text/Layout;", "()Landroid/text/Layout;", "I", "()I", "F", "onCustomAction", "Landroid/graphics/Paint$FontMetricsInt;", "Landroid/graphics/Paint$FontMetricsInt;", "onCommand", "", "Lo/BeanDeserializerModifier;", "[Lo/BeanDeserializerModifier;", "Landroid/graphics/Rect;", "onAddQueueItem", "Landroid/graphics/Rect;", "Lo/addIgnorable;", "Lo/addIgnorable;", "()Lo/addIgnorable;", "onPause", "()Ljava/lang/CharSequence;", "onMediaButtonEvent", "onFastForward"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class addInjectables {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final Paint.FontMetricsInt onCommand;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final TextUtils.TruncateAt RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final addIncludable IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final float MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final BeanDeserializerModifier[] onCustomAction;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final Layout MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final TextPaint read;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final Rect handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final float RatingCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private addIgnorable onAddQueueItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private constructSetterlessProperty AudioAttributesImplApi21Parcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [int] */
    public addInjectables(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, addIncludable addincludable) {
        boolean z3;
        boolean z4;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout staticLayoutWrite;
        boolean z5;
        long j;
        BeanDeserializerModifier beanDeserializerModifier;
        BeanDeserializerModifier beanDeserializerModifier2;
        this.read = textPaint;
        this.RemoteActionCompatParcelizer = truncateAt;
        this.AudioAttributesCompatParcelizer = z;
        this.write = z2;
        this.IconCompatParcelizer = addincludable;
        this.handleMediaPlayPauseIfPendingOnHandler = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicAudioAttributesCompatParcelizer = _validateSubType.AudioAttributesCompatParcelizer(i2);
        Layout.Alignment alignmentIconCompatParcelizer = _isSetterlessType.INSTANCE.IconCompatParcelizer(i);
        boolean z6 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, createBeanDeserializer.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsAudioAttributesCompatParcelizer = addincludable.AudioAttributesCompatParcelizer();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsAudioAttributesCompatParcelizer != null && addincludable.RemoteActionCompatParcelizer() <= f && !z6) {
                this.MediaMetadataCompat = true;
                z3 = true;
                staticLayoutWrite = BeanDeserializerBuilder.INSTANCE.AudioAttributesCompatParcelizer(charSequence, textPaint, iCeil, metricsAudioAttributesCompatParcelizer, alignmentIconCompatParcelizer, z, z2, truncateAt, iCeil);
                textDirectionHeuristic = textDirectionHeuristicAudioAttributesCompatParcelizer;
                z4 = false;
            } else {
                z3 = true;
                this.MediaMetadataCompat = false;
                z4 = false;
                textDirectionHeuristic = textDirectionHeuristicAudioAttributesCompatParcelizer;
                staticLayoutWrite = hasIgnorable.INSTANCE.write(charSequence, textPaint, iCeil, 0, charSequence.length(), textDirectionHeuristicAudioAttributesCompatParcelizer, alignmentIconCompatParcelizer, i3, truncateAt, (int) Math.ceil(d), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
            }
            this.MediaBrowserCompatItemReceiver = staticLayoutWrite;
            Trace.endSection();
            int iMin = Math.min(staticLayoutWrite.getLineCount(), i3);
            this.AudioAttributesImplBaseParcelizer = iMin;
            int i9 = iMin - 1;
            this.AudioAttributesImplApi26Parcelizer = (iMin >= i3 && (staticLayoutWrite.getEllipsisCount(i9) > 0 || staticLayoutWrite.getLineEnd(i9) != charSequence.length())) ? z3 : z4;
            BeanDeserializerModifier[] beanDeserializerModifierArrAudioAttributesCompatParcelizer = _validateSubType.AudioAttributesCompatParcelizer(this);
            this.onCustomAction = beanDeserializerModifierArrAudioAttributesCompatParcelizer;
            if (beanDeserializerModifierArrAudioAttributesCompatParcelizer == null || (beanDeserializerModifier2 = (BeanDeserializerModifier) getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(beanDeserializerModifierArrAudioAttributesCompatParcelizer)) == null) {
                z5 = z4;
            } else {
                z5 = (beanDeserializerModifier2.getWrite() && find.read.write(beanDeserializerModifier2.getMediaBrowserCompatItemReceiver(), find.read.INSTANCE.RemoteActionCompatParcelizer())) ? z3 : z4;
            }
            boolean z7 = (beanDeserializerModifierArrAudioAttributesCompatParcelizer == null || (beanDeserializerModifier = (BeanDeserializerModifier) getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(beanDeserializerModifierArrAudioAttributesCompatParcelizer)) == null || !beanDeserializerModifier.getIconCompatParcelizer() || !find.read.write(beanDeserializerModifier.getMediaBrowserCompatItemReceiver(), find.read.INSTANCE.RemoteActionCompatParcelizer())) ? z4 : z3;
            if (!z5 || !z7) {
                long jIconCompatParcelizer = _validateSubType.IconCompatParcelizer(this);
                j = _validateSubType.read(z5 ? z4 : addBeanProps.read(jIconCompatParcelizer), z7 ? z4 : addBeanProps.write(jIconCompatParcelizer));
            } else {
                j = _validateSubType.RemoteActionCompatParcelizer;
            }
            long jWrite = beanDeserializerModifierArrAudioAttributesCompatParcelizer != null ? _validateSubType.write(beanDeserializerModifierArrAudioAttributesCompatParcelizer) : _validateSubType.RemoteActionCompatParcelizer;
            this.MediaBrowserCompatSearchResultReceiver = Math.max(addBeanProps.read(j), addBeanProps.read(jWrite));
            this.MediaDescriptionCompat = Math.max(addBeanProps.write(j), addBeanProps.write(jWrite));
            Paint.FontMetricsInt fontMetricsIntAudioAttributesCompatParcelizer = _validateSubType.AudioAttributesCompatParcelizer(this, textPaint, textDirectionHeuristic, beanDeserializerModifierArrAudioAttributesCompatParcelizer);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = fontMetricsIntAudioAttributesCompatParcelizer != null ? fontMetricsIntAudioAttributesCompatParcelizer.bottom - ((int) AudioAttributesImplApi21Parcelizer(i9)) : z4;
            this.onCommand = fontMetricsIntAudioAttributesCompatParcelizer;
            this.MediaBrowserCompatMediaItem = materializeAbstractType.IconCompatParcelizer$default(staticLayoutWrite, i9, null, 2, null);
            this.RatingCompat = materializeAbstractType.AudioAttributesCompatParcelizer$default(staticLayoutWrite, i9, null, 2, null);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final TextPaint getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ addInjectables(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, int[] iArr, int[] iArr2, addIncludable addincludable, int i9, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        int i10 = (i9 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i9 & 16) != 0 ? null : truncateAt;
        int i11 = (i9 & 32) != 0 ? 2 : i2;
        this(charSequence, f, textPaint, i10, truncateAt2, i11, (i9 & 64) != 0 ? 1.0f : f2, (i9 & 128) != 0 ? 0.0f : f3, (i9 & 256) != 0 ? false : z, (i9 & 512) != 0 ? true : z2, (i9 & 1024) != 0 ? Integer.MAX_VALUE : i3, (i9 & 2048) != 0 ? 0 : i4, (i9 & 4096) != 0 ? 0 : i5, (i9 & 8192) != 0 ? 0 : i6, (i9 & 16384) != 0 ? 0 : i7, (32768 & i9) != 0 ? 0 : i8, (65536 & i9) != 0 ? null : iArr, (131072 & i9) != 0 ? null : iArr2, (i9 & 262144) != 0 ? new addIncludable(charSequence, textPaint, i11) : addincludable);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final constructSetterlessProperty AudioAttributesImplBaseParcelizer() {
        constructSetterlessProperty constructsetterlessproperty = this.AudioAttributesImplApi21Parcelizer;
        if (constructsetterlessproperty != null) {
            return constructsetterlessproperty;
        }
        constructSetterlessProperty constructsetterlessproperty2 = new constructSetterlessProperty(this.MediaBrowserCompatItemReceiver.getText(), 0, this.MediaBrowserCompatItemReceiver.getText().length(), this.read.getTextLocale());
        this.AudioAttributesImplApi21Parcelizer = constructsetterlessproperty2;
        return constructsetterlessproperty2;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Layout getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    private final addIgnorable MediaDescriptionCompat() {
        addIgnorable addignorable = this.onAddQueueItem;
        if (addignorable == null) {
            addIgnorable addignorable2 = new addIgnorable(this.MediaBrowserCompatItemReceiver);
            this.onAddQueueItem = addignorable2;
            return addignorable2;
        }
        toMagicModuleMetaRepoModel.write(addignorable);
        return addignorable;
    }

    public final CharSequence MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver.getText();
    }

    public final int IconCompatParcelizer() {
        int height;
        if (this.AudioAttributesImplApi26Parcelizer) {
            height = this.MediaBrowserCompatItemReceiver.getLineBottom(this.AudioAttributesImplBaseParcelizer - 1);
        } else {
            height = this.MediaBrowserCompatItemReceiver.getHeight();
        }
        return height + this.MediaBrowserCompatSearchResultReceiver + this.MediaDescriptionCompat + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    private final float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(int p0) {
        return p0 == this.AudioAttributesImplBaseParcelizer + (-1) ? this.MediaBrowserCompatMediaItem + this.RatingCompat : BitmapDescriptorFactory.HUE_RED;
    }

    public final float AudioAttributesImplApi26Parcelizer(int p0) {
        return this.MediaBrowserCompatItemReceiver.getLineLeft(p0) + (p0 == this.AudioAttributesImplBaseParcelizer + (-1) ? this.MediaBrowserCompatMediaItem : BitmapDescriptorFactory.HUE_RED);
    }

    public final float MediaBrowserCompatSearchResultReceiver(int p0) {
        return this.MediaBrowserCompatItemReceiver.getLineRight(p0) + (p0 == this.AudioAttributesImplBaseParcelizer + (-1) ? this.RatingCompat : BitmapDescriptorFactory.HUE_RED);
    }

    public final float MediaMetadataCompat(int p0) {
        return this.MediaBrowserCompatItemReceiver.getLineTop(p0) + (p0 == 0 ? 0 : this.MediaBrowserCompatSearchResultReceiver);
    }

    public final float read(int p0) {
        if (p0 != this.AudioAttributesImplBaseParcelizer - 1 || this.onCommand == null) {
            return this.MediaBrowserCompatSearchResultReceiver + this.MediaBrowserCompatItemReceiver.getLineBottom(p0) + (p0 == this.AudioAttributesImplBaseParcelizer + (-1) ? this.MediaDescriptionCompat : 0);
        }
        return this.MediaBrowserCompatItemReceiver.getLineBottom(p0 - 1) + this.onCommand.bottom;
    }

    public final float IconCompatParcelizer(int p0) {
        float lineBaseline;
        float f = this.MediaBrowserCompatSearchResultReceiver;
        if (p0 == this.AudioAttributesImplBaseParcelizer - 1 && this.onCommand != null) {
            lineBaseline = MediaMetadataCompat(p0) - this.onCommand.ascent;
        } else {
            lineBaseline = this.MediaBrowserCompatItemReceiver.getLineBaseline(p0);
        }
        return f + lineBaseline;
    }

    public final float AudioAttributesImplApi21Parcelizer(int p0) {
        return read(p0) - MediaMetadataCompat(p0);
    }

    public final int RatingCompat(int p0) {
        return this.MediaBrowserCompatItemReceiver.getLineStart(p0);
    }

    public final int AudioAttributesImplBaseParcelizer(int p0) {
        if (_validateSubType.write(this.MediaBrowserCompatItemReceiver, p0) && this.RemoteActionCompatParcelizer == TextUtils.TruncateAt.END) {
            return this.MediaBrowserCompatItemReceiver.getText().length();
        }
        return this.MediaBrowserCompatItemReceiver.getLineEnd(p0);
    }

    public final int MediaDescriptionCompat(int p0) {
        if (_validateSubType.write(this.MediaBrowserCompatItemReceiver, p0) && this.RemoteActionCompatParcelizer == TextUtils.TruncateAt.END) {
            return this.MediaBrowserCompatItemReceiver.getLineStart(p0) + this.MediaBrowserCompatItemReceiver.getEllipsisStart(p0);
        }
        return MediaDescriptionCompat().write(p0);
    }

    public final int AudioAttributesCompatParcelizer(int p0) {
        return this.MediaBrowserCompatItemReceiver.getEllipsisStart(p0);
    }

    public final int RemoteActionCompatParcelizer(int p0) {
        return this.MediaBrowserCompatItemReceiver.getEllipsisCount(p0);
    }

    public final int MediaBrowserCompatItemReceiver(int p0) {
        return this.MediaBrowserCompatItemReceiver.getLineForVertical(p0 - this.MediaBrowserCompatSearchResultReceiver);
    }

    public final int RemoteActionCompatParcelizer(int p0, float p1) {
        return this.MediaBrowserCompatItemReceiver.getOffsetForHorizontal(p0, p1 + (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(p0) * (-1.0f)));
    }

    public static /* synthetic */ float read$default(addInjectables addinjectables, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return addinjectables.read(i, z);
    }

    public final float read(int p0, boolean p1) {
        return MediaDescriptionCompat().IconCompatParcelizer(p0, true, p1) + MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(MediaBrowserCompatCustomActionResultReceiver(p0));
    }

    public static /* synthetic */ float AudioAttributesCompatParcelizer$default(addInjectables addinjectables, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return addinjectables.AudioAttributesCompatParcelizer(i, z);
    }

    public final float AudioAttributesCompatParcelizer(int p0, boolean p1) {
        return MediaDescriptionCompat().IconCompatParcelizer(p0, false, p1) + MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(MediaBrowserCompatCustomActionResultReceiver(p0));
    }

    public final int MediaBrowserCompatCustomActionResultReceiver(int p0) {
        return this.MediaBrowserCompatItemReceiver.getLineForOffset(p0);
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler(int p0) {
        return this.MediaBrowserCompatItemReceiver.isRtlCharAt(p0);
    }

    public final int MediaBrowserCompatMediaItem(int p0) {
        return this.MediaBrowserCompatItemReceiver.getParagraphDirection(p0);
    }

    public final void RemoteActionCompatParcelizer(int p0, int p1, Path p2) {
        this.MediaBrowserCompatItemReceiver.getSelectionPath(p0, p1, p2);
        if (this.MediaBrowserCompatSearchResultReceiver == 0 || p2.isEmpty()) {
            return;
        }
        p2.offset(BitmapDescriptorFactory.HUE_RED, this.MediaBrowserCompatSearchResultReceiver);
    }

    public final int[] AudioAttributesCompatParcelizer(RectF p0, int p1, MagicModuleSubmissionRequestBody<? super RectF, ? super RectF, Boolean> p2) {
        if (Build.VERSION.SDK_INT >= 34) {
            return handlePolymorphic.INSTANCE.AudioAttributesCompatParcelizer(this, p0, p1, p2);
        }
        return addBackReferenceProperties.RemoteActionCompatParcelizer(this, this.MediaBrowserCompatItemReceiver, MediaDescriptionCompat(), p0, p1, p2);
    }

    public final void AudioAttributesCompatParcelizer(int p0, float[] p1) {
        float fIconCompatParcelizer;
        float fRemoteActionCompatParcelizer;
        int iRatingCompat = RatingCompat(p0);
        int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(p0);
        if (p1.length < ((iAudioAttributesImplBaseParcelizer - iRatingCompat) << 1)) {
            withStackTrace.read("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        addProperty addproperty = new addProperty(this);
        int i = 0;
        boolean z = MediaBrowserCompatMediaItem(p0) == 1;
        while (iRatingCompat < iAudioAttributesImplBaseParcelizer) {
            boolean zHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler(iRatingCompat);
            if (z && !zHandleMediaPlayPauseIfPendingOnHandler) {
                fIconCompatParcelizer = addproperty.write(iRatingCompat);
                fRemoteActionCompatParcelizer = addproperty.IconCompatParcelizer(iRatingCompat + 1);
            } else if (z && zHandleMediaPlayPauseIfPendingOnHandler) {
                fRemoteActionCompatParcelizer = addproperty.read(iRatingCompat);
                fIconCompatParcelizer = addproperty.RemoteActionCompatParcelizer(iRatingCompat + 1);
            } else if (zHandleMediaPlayPauseIfPendingOnHandler) {
                fRemoteActionCompatParcelizer = addproperty.write(iRatingCompat);
                fIconCompatParcelizer = addproperty.IconCompatParcelizer(iRatingCompat + 1);
            } else {
                fIconCompatParcelizer = addproperty.read(iRatingCompat);
                fRemoteActionCompatParcelizer = addproperty.RemoteActionCompatParcelizer(iRatingCompat + 1);
            }
            p1[i] = fIconCompatParcelizer;
            p1[i + 1] = fRemoteActionCompatParcelizer;
            i += 2;
            iRatingCompat++;
        }
    }

    public final void write(int p0, int p1, float[] p2, int p3) {
        float fIconCompatParcelizer;
        float fRemoteActionCompatParcelizer;
        int length = MediaBrowserCompatItemReceiver().length();
        if (p0 < 0) {
            withStackTrace.read("startOffset must be > 0");
        }
        if (p0 >= length) {
            withStackTrace.read("startOffset must be less than text length");
        }
        if (p1 <= p0) {
            withStackTrace.read("endOffset must be greater than startOffset");
        }
        if (p1 > length) {
            withStackTrace.read("endOffset must be smaller or equal to text length");
        }
        if (p2.length - p3 < ((p1 - p0) << 2)) {
            withStackTrace.read("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(p0);
        int iMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver(p1 - 1);
        addProperty addproperty = new addProperty(this);
        if (iMediaBrowserCompatCustomActionResultReceiver > iMediaBrowserCompatCustomActionResultReceiver2) {
            return;
        }
        while (true) {
            int iRatingCompat = RatingCompat(iMediaBrowserCompatCustomActionResultReceiver);
            int iAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(iMediaBrowserCompatCustomActionResultReceiver);
            int iMin = Math.min(p1, iAudioAttributesImplBaseParcelizer);
            float fMediaMetadataCompat = MediaMetadataCompat(iMediaBrowserCompatCustomActionResultReceiver);
            float f = read(iMediaBrowserCompatCustomActionResultReceiver);
            boolean z = MediaBrowserCompatMediaItem(iMediaBrowserCompatCustomActionResultReceiver) == 1;
            for (int iMax = Math.max(p0, iRatingCompat); iMax < iMin; iMax++) {
                boolean zHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler(iMax);
                if (z && !zHandleMediaPlayPauseIfPendingOnHandler) {
                    fIconCompatParcelizer = addproperty.write(iMax);
                    fRemoteActionCompatParcelizer = addproperty.IconCompatParcelizer(iMax + 1);
                } else if (z && zHandleMediaPlayPauseIfPendingOnHandler) {
                    fRemoteActionCompatParcelizer = addproperty.read(iMax);
                    fIconCompatParcelizer = addproperty.RemoteActionCompatParcelizer(iMax + 1);
                } else if (!z && zHandleMediaPlayPauseIfPendingOnHandler) {
                    fRemoteActionCompatParcelizer = addproperty.write(iMax);
                    fIconCompatParcelizer = addproperty.IconCompatParcelizer(iMax + 1);
                } else {
                    fIconCompatParcelizer = addproperty.read(iMax);
                    fRemoteActionCompatParcelizer = addproperty.RemoteActionCompatParcelizer(iMax + 1);
                }
                p2[p3] = fIconCompatParcelizer;
                p2[p3 + 1] = fMediaMetadataCompat;
                p2[p3 + 2] = fRemoteActionCompatParcelizer;
                p2[p3 + 3] = f;
                p3 += 4;
            }
            if (iMediaBrowserCompatCustomActionResultReceiver == iMediaBrowserCompatCustomActionResultReceiver2) {
                return;
            } else {
                iMediaBrowserCompatCustomActionResultReceiver++;
            }
        }
    }

    public final RectF write(int p0) {
        float fAudioAttributesCompatParcelizer;
        float fAudioAttributesCompatParcelizer2;
        float fAudioAttributesCompatParcelizer3;
        float fAudioAttributesCompatParcelizer4;
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(p0);
        float fMediaMetadataCompat = MediaMetadataCompat(iMediaBrowserCompatCustomActionResultReceiver);
        float f = read(iMediaBrowserCompatCustomActionResultReceiver);
        boolean z = MediaBrowserCompatMediaItem(iMediaBrowserCompatCustomActionResultReceiver) == 1;
        boolean zIsRtlCharAt = this.MediaBrowserCompatItemReceiver.isRtlCharAt(p0);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer(p0, false);
                fAudioAttributesCompatParcelizer4 = AudioAttributesCompatParcelizer(p0 + 1, true);
            } else if (zIsRtlCharAt) {
                fAudioAttributesCompatParcelizer3 = read(p0, false);
                fAudioAttributesCompatParcelizer4 = read(p0 + 1, true);
            } else {
                fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p0, false);
                fAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(p0 + 1, true);
            }
            float f2 = fAudioAttributesCompatParcelizer3;
            fAudioAttributesCompatParcelizer = fAudioAttributesCompatParcelizer4;
            fAudioAttributesCompatParcelizer2 = f2;
        } else {
            fAudioAttributesCompatParcelizer = read(p0, false);
            fAudioAttributesCompatParcelizer2 = read(p0 + 1, true);
        }
        return new RectF(fAudioAttributesCompatParcelizer, fMediaMetadataCompat, fAudioAttributesCompatParcelizer2, f);
    }

    public final void IconCompatParcelizer(Canvas p0) {
        if (p0.getClipBounds(this.handleMediaPlayPauseIfPendingOnHandler)) {
            int i = this.MediaBrowserCompatSearchResultReceiver;
            if (i != 0) {
                p0.translate(BitmapDescriptorFactory.HUE_RED, i);
            }
            ThreadLocal<setPOJOBuilder> threadLocal = _validateSubType.read();
            setPOJOBuilder setpojobuilder = threadLocal.get();
            if (setpojobuilder == null) {
                setpojobuilder = new setPOJOBuilder();
                threadLocal.set(setpojobuilder);
            }
            setPOJOBuilder setpojobuilder2 = setpojobuilder;
            setpojobuilder2.IconCompatParcelizer(p0);
            try {
                this.MediaBrowserCompatItemReceiver.draw(setpojobuilder2);
                setpojobuilder2.IconCompatParcelizer(null);
                int i2 = this.MediaBrowserCompatSearchResultReceiver;
                if (i2 != 0) {
                    p0.translate(BitmapDescriptorFactory.HUE_RED, i2 * (-1.0f));
                }
            } catch (Throwable th) {
                setpojobuilder2.IconCompatParcelizer(null);
                throw th;
            }
        }
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        if (this.MediaMetadataCompat) {
            BeanDeserializerBuilder beanDeserializerBuilder = BeanDeserializerBuilder.INSTANCE;
            Layout layout = this.MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.read(layout, "");
            return beanDeserializerBuilder.read((BoringLayout) layout);
        }
        hasIgnorable hasignorable = hasIgnorable.INSTANCE;
        Layout layout2 = this.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.read(layout2, "");
        return hasignorable.read((StaticLayout) layout2, this.write);
    }
}
