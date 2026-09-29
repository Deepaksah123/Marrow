package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0002\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0002\u0010\b\"\u0018\u0010\f\u001a\u00020\u0005*\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lo/hasIndex;", "", "write", "(Lo/hasIndex;)V", "Lo/_handleOddName$IconCompatParcelizer;", "", "p0", "Lo/WritableTypeIdInclusion;", "(Lo/_handleOddName$IconCompatParcelizer;Z)Lo/WritableTypeIdInclusion;", "Lo/valueInstantiators;", "IconCompatParcelizer", "(Lo/valueInstantiators;)Z", "AudioAttributesCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getValueNulls {
    public static final void write(hasIndex hasindex) {
        collectLongDefaults.AudioAttributesImplApi26Parcelizer(hasindex).menuHostHelperlambda0();
    }

    public static final boolean IconCompatParcelizer(C0216valueInstantiators c0216valueInstantiators) {
        return withDeserializerModifier.read(c0216valueInstantiators, withAbstractTypeResolver.INSTANCE.MediaBrowserCompatSearchResultReceiver()) != null;
    }

    public static final WritableTypeIdInclusion write(_handleOddName.IconCompatParcelizer iconCompatParcelizer, boolean z) {
        if (!iconCompatParcelizer.getRead().getRatingCompat()) {
            return WritableTypeIdInclusion.INSTANCE.write();
        }
        if (!z) {
            return hasRawClass.IconCompatParcelizer(collectLongDefaults.write((Module) iconCompatParcelizer, _bind.write(8)));
        }
        return collectLongDefaults.write((Module) iconCompatParcelizer, _bind.write(8))._init_lambda4();
    }
}
