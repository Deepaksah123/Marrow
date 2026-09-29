package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\b"}, d2 = {"Lo/isStructEnd;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/hasIndex;", "Lkotlin/Function1;", "Lo/getConfigOverride;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "write", "(Lo/getConfigOverride;)V", "MediaDescriptionCompat", "()V", "AudioAttributesCompatParcelizer", "Lo/getAnswerMap;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class isStructEnd extends _handleOddName.IconCompatParcelizer implements hasIndex {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super getConfigOverride, getShowPopup> read;

    public final void read(getAnswerMap<? super getConfigOverride, getShowPopup> getanswermap) {
        this.read = getanswermap;
    }

    public isStructEnd(getAnswerMap<? super getConfigOverride, getShowPopup> getanswermap) {
        this.read = getanswermap;
    }

    @Override // kotlin.hasIndex
    public final void write(final getConfigOverride getconfigoverride) {
        PropertyName.write(this, appendUnquoted.INSTANCE, new getAnswerMap() { // from class: o.isScalarValue
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(isStructEnd.IconCompatParcelizer(getconfigoverride, (createForPropertyOverride) obj));
            }
        });
        this.read.invoke(getconfigoverride);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(getConfigOverride getconfigoverride, createForPropertyOverride createforpropertyoverride) {
        toMagicModuleMetaRepoModel.read(createforpropertyoverride, "");
        ((appendUnquotedUTF8) createforpropertyoverride).AudioAttributesCompatParcelizer(getconfigoverride);
        return false;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    public final void MediaDescriptionCompat() {
        super.MediaDescriptionCompat();
        PropertyName.write(this, appendUnquoted.INSTANCE, new getAnswerMap() { // from class: o.getFactory
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(isStructEnd.RemoteActionCompatParcelizer((createForPropertyOverride) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(createForPropertyOverride createforpropertyoverride) {
        toMagicModuleMetaRepoModel.read(createforpropertyoverride, "");
        ((appendUnquotedUTF8) createforpropertyoverride).write();
        return false;
    }
}
