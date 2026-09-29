package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R4\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\u0011\"\u0004\b\f\u0010\n"}, d2 = {"Lo/isPrimitive;", "Lo/_initForReading;", "Lo/_handleOddName$IconCompatParcelizer;", "Lkotlin/Function3;", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "p0", "<init>", "(Lo/getModuleData;)V", "p1", "read", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "", "toString", "()Ljava/lang/String;", "Lo/getModuleData;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isPrimitive extends _handleOddName.IconCompatParcelizer implements _initForReading {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private getModuleData<? super withContentValueHandler, ? super isTypeOrSuperTypeOf, ? super PropertyValueAny, ? extends withHandlersFrom> RemoteActionCompatParcelizer;

    public isPrimitive(getModuleData<? super withContentValueHandler, ? super isTypeOrSuperTypeOf, ? super PropertyValueAny, ? extends withHandlersFrom> getmoduledata) {
        this.RemoteActionCompatParcelizer = getmoduledata;
    }

    public final void read(getModuleData<? super withContentValueHandler, ? super isTypeOrSuperTypeOf, ? super PropertyValueAny, ? extends withHandlersFrom> getmoduledata) {
        this.RemoteActionCompatParcelizer = getmoduledata;
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(withcontentvaluehandler, istypeorsupertypeof, PropertyValueAny.read(j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LayoutModifierImpl(measureBlock=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
