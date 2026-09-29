package kotlin;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tR.\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\t"}, d2 = {"Lo/Checks1;", "Lo/addAbstractTypeResolver;", "Lo/getLongMask;", "Lkotlin/Function2;", "Lo/getAdapterPosition;", "Landroid/content/Context;", "", "p0", "<init>", "(Lo/MagicModuleSubmissionRequestBody;)V", "RemoteActionCompatParcelizer", "Lo/MagicModuleSubmissionRequestBody;", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Checks1 extends addAbstractTypeResolver implements getLongMask {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super getAdapterPosition, ? super Context, getShowPopup> write;

    public Checks1(MagicModuleSubmissionRequestBody<? super getAdapterPosition, ? super Context, getShowPopup> magicModuleSubmissionRequestBody) {
        this.write = magicModuleSubmissionRequestBody;
        AudioAttributesCompatParcelizer(new InstrumentationActivityInvokerEmptyActivity1(new getAnswerMap() { // from class: o.AutoTransition
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Checks1.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (getAdapterPosition) obj);
            }
        }));
    }

    public final void read(MagicModuleSubmissionRequestBody<? super getAdapterPosition, ? super Context, getShowPopup> magicModuleSubmissionRequestBody) {
        this.write = magicModuleSubmissionRequestBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(Checks1 checks1, getAdapterPosition getadapterposition) {
        checks1.write.invoke(getadapterposition, MappingJsonFactory.write(checks1, AndroidCompositionLocals_androidKt.IconCompatParcelizer()));
        return getShowPopup.INSTANCE;
    }
}
