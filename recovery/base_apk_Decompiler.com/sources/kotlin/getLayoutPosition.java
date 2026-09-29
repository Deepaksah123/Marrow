package kotlin;

import android.view.textclassifier.TextClassification;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u000b\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/getAdapterPosition;", "", "p0", "", "p1", "", "p2", "Lkotlin/Function1;", "Lo/isRecyclable;", "", "p3", "write", "(Lo/getAdapterPosition;Ljava/lang/Object;Ljava/lang/String;ILo/getAnswerMap;)V", "Landroid/view/textclassifier/TextClassification;", "read", "(Lo/getAdapterPosition;Ljava/lang/Object;Landroid/view/textclassifier/TextClassification;I)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getLayoutPosition {
    public static /* synthetic */ void write$default(getAdapterPosition getadapterposition, Object obj, String str, int i, getAnswerMap getanswermap, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        write(getadapterposition, obj, str, i, getanswermap);
    }

    public static final void write(getAdapterPosition getadapterposition, Object obj, String str, int i, getAnswerMap<? super isRecyclable, getShowPopup> getanswermap) {
        getadapterposition.write(new getUnmodifiedPayloads(obj, str, i, getanswermap));
    }

    public static final void read(getAdapterPosition getadapterposition, Object obj, TextClassification textClassification, int i) {
        getadapterposition.write(new isRemoved(obj, textClassification, i));
    }
}
