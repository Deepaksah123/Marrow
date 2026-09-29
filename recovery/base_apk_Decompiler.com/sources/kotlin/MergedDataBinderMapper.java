package kotlin;

import java.util.List;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\u00020\f*\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/MergedDataBinderMapper;", "Lo/withTypeHandler;", "Lo/_skipWSOrEnd;", "p0", "", "p1", "<init>", "(Lo/_skipWSOrEnd;Z)V", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Lo/_skipWSOrEnd;", "IconCompatParcelizer", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class MergedDataBinderMapper implements withTypeHandler {
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final _skipWSOrEnd AudioAttributesCompatParcelizer;

    public MergedDataBinderMapper(_skipWSOrEnd _skipwsorend, boolean z) {
        this.AudioAttributesCompatParcelizer = _skipwsorend;
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin.withTypeHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(final withContentValueHandler withcontentvaluehandler, final List<? extends isTypeOrSuperTypeOf> list, long j) {
        int iMediaBrowserCompatItemReceiver;
        int iMediaBrowserCompatCustomActionResultReceiver;
        _parser _parserVarWrite;
        if (list.isEmpty()) {
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueAny.MediaBrowserCompatItemReceiver(j), PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j), null, new getAnswerMap() { // from class: o.AbsSavedState
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return MergedDataBinderMapper.AudioAttributesCompatParcelizer((_parser.IconCompatParcelizer) obj);
                }
            }, 4, null);
        }
        long jWrite = this.IconCompatParcelizer ? j : PropertyValueAny.write(j & (-8589934589L));
        if (list.size() == 1) {
            final isTypeOrSuperTypeOf istypeorsupertypeof = list.get(0);
            if (!AbsSavedState1.read(istypeorsupertypeof)) {
                _parserVarWrite = istypeorsupertypeof.write(jWrite);
                iMediaBrowserCompatItemReceiver = Math.max(PropertyValueAny.MediaBrowserCompatItemReceiver(j), _parserVarWrite.getRead());
                iMediaBrowserCompatCustomActionResultReceiver = Math.max(PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j), _parserVarWrite.getRemoteActionCompatParcelizer());
            } else {
                iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
                iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
                _parserVarWrite = istypeorsupertypeof.write(PropertyValueAny.INSTANCE.AudioAttributesCompatParcelizer(PropertyValueAny.MediaBrowserCompatItemReceiver(j), PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j)));
            }
            final int i = iMediaBrowserCompatCustomActionResultReceiver;
            final _parser _parserVar = _parserVarWrite;
            final int i2 = iMediaBrowserCompatItemReceiver;
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, i2, i, null, new getAnswerMap() { // from class: o.setChildInsets
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return MergedDataBinderMapper.AudioAttributesCompatParcelizer(_parserVar, istypeorsupertypeof, withcontentvaluehandler, i2, i, this, (_parser.IconCompatParcelizer) obj);
                }
            }, 4, null);
        }
        final _parser[] _parserVarArr = new _parser[list.size()];
        final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
        iconCompatParcelizer.AudioAttributesCompatParcelizer = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
        final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer2 = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
        iconCompatParcelizer2.AudioAttributesCompatParcelizer = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
        List<? extends isTypeOrSuperTypeOf> list2 = list;
        int size = list2.size();
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            isTypeOrSuperTypeOf istypeorsupertypeof2 = list.get(i3);
            if (AbsSavedState1.read(istypeorsupertypeof2)) {
                z = true;
            } else {
                _parser _parserVarWrite2 = istypeorsupertypeof2.write(jWrite);
                _parserVarArr[i3] = _parserVarWrite2;
                iconCompatParcelizer.AudioAttributesCompatParcelizer = Math.max(iconCompatParcelizer.AudioAttributesCompatParcelizer, _parserVarWrite2.getRead());
                iconCompatParcelizer2.AudioAttributesCompatParcelizer = Math.max(iconCompatParcelizer2.AudioAttributesCompatParcelizer, _parserVarWrite2.getRemoteActionCompatParcelizer());
            }
        }
        if (z) {
            long j2 = PropertyValueBuffer.read(iconCompatParcelizer.AudioAttributesCompatParcelizer != Integer.MAX_VALUE ? iconCompatParcelizer.AudioAttributesCompatParcelizer : 0, iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer2.AudioAttributesCompatParcelizer != Integer.MAX_VALUE ? iconCompatParcelizer2.AudioAttributesCompatParcelizer : 0, iconCompatParcelizer2.AudioAttributesCompatParcelizer);
            int size2 = list2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                isTypeOrSuperTypeOf istypeorsupertypeof3 = list.get(i4);
                if (AbsSavedState1.read(istypeorsupertypeof3)) {
                    _parserVarArr[i4] = istypeorsupertypeof3.write(j2);
                }
            }
        }
        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer2.AudioAttributesCompatParcelizer, null, new getAnswerMap() { // from class: o.readObject
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return MergedDataBinderMapper.read(_parserVarArr, list, withcontentvaluehandler, iconCompatParcelizer, iconCompatParcelizer2, this, (_parser.IconCompatParcelizer) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_parser _parserVar, isTypeOrSuperTypeOf istypeorsupertypeof, withContentValueHandler withcontentvaluehandler, int i, int i2, MergedDataBinderMapper mergedDataBinderMapper, _parser.IconCompatParcelizer iconCompatParcelizer) {
        AbsSavedState1.RemoteActionCompatParcelizer(iconCompatParcelizer, _parserVar, istypeorsupertypeof, withcontentvaluehandler.getRead(), i, i2, mergedDataBinderMapper.AudioAttributesCompatParcelizer);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(_parser[] _parserVarArr, List list, withContentValueHandler withcontentvaluehandler, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer2, MergedDataBinderMapper mergedDataBinderMapper, _parser.IconCompatParcelizer iconCompatParcelizer3) {
        int length = _parserVarArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            _parser _parserVar = _parserVarArr[i];
            toMagicModuleMetaRepoModel.read(_parserVar, "");
            AbsSavedState1.RemoteActionCompatParcelizer(iconCompatParcelizer3, _parserVar, (isTypeOrSuperTypeOf) list.get(i2), withcontentvaluehandler.getRead(), iconCompatParcelizer.AudioAttributesCompatParcelizer, iconCompatParcelizer2.AudioAttributesCompatParcelizer, mergedDataBinderMapper.AudioAttributesCompatParcelizer);
            i++;
            i2++;
        }
        return getShowPopup.INSTANCE;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MergedDataBinderMapper)) {
            return false;
        }
        MergedDataBinderMapper mergedDataBinderMapper = (MergedDataBinderMapper) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, mergedDataBinderMapper.AudioAttributesCompatParcelizer) && this.IconCompatParcelizer == mergedDataBinderMapper.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergedDataBinderMapper(AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
