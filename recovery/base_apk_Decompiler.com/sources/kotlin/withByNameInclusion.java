package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin._deserializeIfNatural;
import kotlin._findCustomTreeNodeDeserializer;
import kotlin.findOnlyParamWithoutInjection;
import kotlin.findSize;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"$\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\" \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\t8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\" \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\u00018\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b\"$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u000e8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0010\" \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\b\"$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00128AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0014\" \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\b\"$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00178CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0019\" \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\b"}, d2 = {"Lo/_findCustomTreeNodeDeserializer$RemoteActionCompatParcelizer;", "Lo/parseManyDecDigits;", "Lo/_findCustomTreeNodeDeserializer;", "", "RemoteActionCompatParcelizer", "(Lo/_findCustomTreeNodeDeserializer$RemoteActionCompatParcelizer;)Lo/parseManyDecDigits;", "write", "IconCompatParcelizer", "Lo/parseManyDecDigits;", "Lo/_deserializeIfNatural$IconCompatParcelizer;", "Lo/_deserializeIfNatural;", "read", "(Lo/_deserializeIfNatural$IconCompatParcelizer;)Lo/parseManyDecDigits;", "AudioAttributesCompatParcelizer", "Lo/findSize$RemoteActionCompatParcelizer;", "Lo/findSize;", "(Lo/findSize$RemoteActionCompatParcelizer;)Lo/parseManyDecDigits;", "MediaBrowserCompatItemReceiver", "Lo/findOnlyParamWithoutInjection$read;", "Lo/findOnlyParamWithoutInjection;", "(Lo/findOnlyParamWithoutInjection$read;)Lo/parseManyDecDigits;", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/findOnlyParamWithoutInjection$AudioAttributesCompatParcelizer$IconCompatParcelizer;", "Lo/findOnlyParamWithoutInjection$AudioAttributesCompatParcelizer;", "(Lo/findOnlyParamWithoutInjection$AudioAttributesCompatParcelizer$IconCompatParcelizer;)Lo/parseManyDecDigits;", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class withByNameInclusion {
    private static final parseManyDecDigits<_findCustomTreeNodeDeserializer, Object> IconCompatParcelizer = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.deserializeWithView
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return withByNameInclusion.IconCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (_findCustomTreeNodeDeserializer) obj2);
        }
    }, new getAnswerMap() { // from class: o.withIgnoreAllUnknown
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return withByNameInclusion.AudioAttributesImplApi26Parcelizer(obj);
        }
    });
    private static final parseManyDecDigits<_deserializeIfNatural, Object> write = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.setBean
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return withByNameInclusion.IconCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (_deserializeIfNatural) obj2);
        }
    }, new getAnswerMap() { // from class: o.handleResolvedForwardReference
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return withByNameInclusion.AudioAttributesImplApi21Parcelizer(obj);
        }
    });
    private static final parseManyDecDigits<findSize, Object> read = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.BeanDeserializerBase
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return withByNameInclusion.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (findSize) obj2);
        }
    }, new getAnswerMap() { // from class: o.BeanDeserializer1
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return withByNameInclusion.AudioAttributesImplBaseParcelizer(obj);
        }
    });
    private static final parseManyDecDigits<findOnlyParamWithoutInjection, Object> RemoteActionCompatParcelizer = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.BeanDeserializerBeanReferring
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return withByNameInclusion.RemoteActionCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (findOnlyParamWithoutInjection) obj2);
        }
    }, new getAnswerMap() { // from class: o.throwOrReturnThrowable
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return withByNameInclusion.MediaBrowserCompatItemReceiver(obj);
        }
    });
    private static final parseManyDecDigits<findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer, Object> AudioAttributesCompatParcelizer = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o._findDelegateDeserializer
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return withByNameInclusion.read((JavaDoubleBitsFromCharSequence) obj, (findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer) obj2);
        }
    }, new getAnswerMap() { // from class: o._delegateDeserializer
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return withByNameInclusion.MediaBrowserCompatCustomActionResultReceiver(obj);
        }
    });

    public static final parseManyDecDigits<_findCustomTreeNodeDeserializer, Object> RemoteActionCompatParcelizer(_findCustomTreeNodeDeserializer.Companion companion) {
        return IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, _findCustomTreeNodeDeserializer _findcustomtreenodedeserializer) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(_findRemappedType.onRemoveQueueItemAt(Boolean.valueOf(_findcustomtreenodedeserializer.getRemoteActionCompatParcelizer())), _findRemappedType.write(_deserializeIfNatural.IconCompatParcelizer(_findcustomtreenodedeserializer.getRead()), read(_deserializeIfNatural.INSTANCE), javaDoubleBitsFromCharSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _findCustomTreeNodeDeserializer AudioAttributesImplApi26Parcelizer(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Boolean bool = obj2 != null ? (Boolean) obj2 : null;
        toMagicModuleMetaRepoModel.write(bool);
        boolean zBooleanValue = bool.booleanValue();
        Object obj3 = list.get(1);
        parseManyDecDigits<_deserializeIfNatural, Object> parsemanydecdigits = read(_deserializeIfNatural.INSTANCE);
        _deserializeIfNatural _deserializeifnaturalIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, Boolean.FALSE) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj3 != null) ? parsemanydecdigits.IconCompatParcelizer(obj3) : null;
        toMagicModuleMetaRepoModel.write(_deserializeifnaturalIconCompatParcelizer);
        return new _findCustomTreeNodeDeserializer(_deserializeifnaturalIconCompatParcelizer.getWrite(), zBooleanValue, null);
    }

    public static final parseManyDecDigits<_deserializeIfNatural, Object> read(_deserializeIfNatural.Companion companion) {
        return write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _deserializeIfNatural AudioAttributesImplApi21Parcelizer(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return _deserializeIfNatural.IconCompatParcelizer(_deserializeIfNatural.AudioAttributesCompatParcelizer(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, _deserializeIfNatural _deserializeifnatural) {
        return Integer.valueOf(_deserializeifnatural.getWrite());
    }

    public static final parseManyDecDigits<findSize, Object> AudioAttributesCompatParcelizer(findSize.Companion companion) {
        return read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, findSize findsize) {
        return Integer.valueOf(findsize.getWrite());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final findSize AudioAttributesImplBaseParcelizer(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return findSize.RemoteActionCompatParcelizer(findSize.AudioAttributesCompatParcelizer(((Integer) obj).intValue()));
    }

    public static final parseManyDecDigits<findOnlyParamWithoutInjection, Object> IconCompatParcelizer(findOnlyParamWithoutInjection.Companion companion) {
        return RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, findOnlyParamWithoutInjection findonlyparamwithoutinjection) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(_findRemappedType.write(findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer.write(findonlyparamwithoutinjection.getWrite()), read(findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer.INSTANCE), javaDoubleBitsFromCharSequence), _findRemappedType.onRemoveQueueItemAt(Boolean.valueOf(findonlyparamwithoutinjection.getRead())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final findOnlyParamWithoutInjection MediaBrowserCompatItemReceiver(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Object obj2 = list.get(0);
        parseManyDecDigits<findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer, Object> parsemanydecdigits = read(findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer.INSTANCE);
        findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer audioAttributesCompatParcelizerIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, Boolean.FALSE) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj2 != null) ? parsemanydecdigits.IconCompatParcelizer(obj2) : null;
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerIconCompatParcelizer);
        int write2 = audioAttributesCompatParcelizerIconCompatParcelizer.getWrite();
        Object obj3 = list.get(1);
        Boolean bool = obj3 != null ? (Boolean) obj3 : null;
        toMagicModuleMetaRepoModel.write(bool);
        return new findOnlyParamWithoutInjection(write2, bool.booleanValue(), null);
    }

    private static final parseManyDecDigits<findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer, Object> read(findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer.Companion companion) {
        return AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object read(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        return Integer.valueOf(audioAttributesCompatParcelizer.getWrite());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer.write(findOnlyParamWithoutInjection.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(((Integer) obj).intValue()));
    }
}
