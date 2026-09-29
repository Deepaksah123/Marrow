package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0001\u001a\u0004\u0018\u00010\r2\b\u0010\u0002\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\b\u0010\u0010"}, d2 = {"Lo/deserializeWithObjectId;", "p0", "p1", "", "p2", "AudioAttributesCompatParcelizer", "(Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;F)Lo/deserializeWithObjectId;", "Lo/tryToResolveUnresolved;", "IconCompatParcelizer", "(Lo/deserializeWithObjectId;Lo/tryToResolveUnresolved;)Lo/deserializeWithObjectId;", "Lo/withCaseInsensitivity;", "read", "(Lo/tryToResolveUnresolved;I)I", "Lo/_findCustomReferenceDeserializer;", "Lo/_findCustomTreeNodeDeserializer;", "Lo/_getSetterInfo;", "(Lo/_findCustomReferenceDeserializer;Lo/_findCustomTreeNodeDeserializer;)Lo/_getSetterInfo;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class injectValues {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[tryToResolveUnresolved.values().length];
            try {
                iArr[tryToResolveUnresolved.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tryToResolveUnresolved.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    public static final deserializeWithObjectId AudioAttributesCompatParcelizer(deserializeWithObjectId deserializewithobjectid, deserializeWithObjectId deserializewithobjectid2, float f) {
        return new deserializeWithObjectId(_convertObjectId.IconCompatParcelizer(deserializewithobjectid.onRemoveQueueItemAt(), deserializewithobjectid2.onRemoveQueueItemAt(), f), _findCustomEnumDeserializer.RemoteActionCompatParcelizer(deserializewithobjectid.onRemoveQueueItem(), deserializewithobjectid2.onRemoveQueueItem(), f));
    }

    public static final deserializeWithObjectId IconCompatParcelizer(deserializeWithObjectId deserializewithobjectid, tryToResolveUnresolved trytoresolveunresolved) {
        return new deserializeWithObjectId(_convertObjectId.RemoteActionCompatParcelizer(deserializewithobjectid.getAudioAttributesCompatParcelizer()), _findCustomEnumDeserializer.RemoteActionCompatParcelizer(deserializewithobjectid.getRead(), trytoresolveunresolved), deserializewithobjectid.getWrite());
    }

    public static final int read(tryToResolveUnresolved trytoresolveunresolved, int i) {
        if (withCaseInsensitivity.read(i, withCaseInsensitivity.INSTANCE.IconCompatParcelizer())) {
            int i2 = WhenMappings.IconCompatParcelizer[trytoresolveunresolved.ordinal()];
            if (i2 == 1) {
                return withCaseInsensitivity.INSTANCE.AudioAttributesCompatParcelizer();
            }
            if (i2 != 2) {
                throw new RenewEligibleCreator();
            }
            return withCaseInsensitivity.INSTANCE.RemoteActionCompatParcelizer();
        }
        if (!withCaseInsensitivity.read(i, withCaseInsensitivity.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
            return i;
        }
        int i3 = WhenMappings.IconCompatParcelizer[trytoresolveunresolved.ordinal()];
        if (i3 == 1) {
            return withCaseInsensitivity.INSTANCE.write();
        }
        if (i3 != 2) {
            throw new RenewEligibleCreator();
        }
        return withCaseInsensitivity.INSTANCE.read();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _getSetterInfo IconCompatParcelizer(_findCustomReferenceDeserializer _findcustomreferencedeserializer, _findCustomTreeNodeDeserializer _findcustomtreenodedeserializer) {
        if (_findcustomreferencedeserializer == null && _findcustomtreenodedeserializer == null) {
            return null;
        }
        return hasSerializerModifiers.AudioAttributesCompatParcelizer(_findcustomreferencedeserializer, _findcustomtreenodedeserializer);
    }
}
