package com.marrow.ui.views;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/marrow/ui/views/CustomTypefaceSpan;", "Landroid/text/style/TypefaceSpan;", "", "p0", "Landroid/graphics/Typeface;", "p1", "<init>", "(Ljava/lang/String;Landroid/graphics/Typeface;)V", "Landroid/text/TextPaint;", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "updateMeasureState", "read", "Landroid/graphics/Typeface;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomTypefaceSpan extends TypefaceSpan {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Typeface read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomTypefaceSpan(String str, Typeface typeface) {
        super(str);
        toMagicModuleMetaRepoModel.write(typeface, "");
        this.read = typeface;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Companion.RemoteActionCompatParcelizer(p0, this.read);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Companion.RemoteActionCompatParcelizer(p0, this.read);
    }

    /* JADX INFO: renamed from: com.marrow.ui.views.CustomTypefaceSpan$write, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow/ui/views/CustomTypefaceSpan$write;", "", "<init>", "()V", "Landroid/graphics/Paint;", "p0", "Landroid/graphics/Typeface;", "p1", "", "RemoteActionCompatParcelizer", "(Landroid/graphics/Paint;Landroid/graphics/Typeface;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void RemoteActionCompatParcelizer(Paint p0, Typeface p1) {
            Typeface typeface = p0.getTypeface();
            int style = (typeface != null ? typeface.getStyle() : 0) & (~p1.getStyle());
            if ((style & 1) != 0) {
                p0.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                p0.setTextSkewX(-0.25f);
            }
            p0.setTypeface(p1);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
