package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\u0017*\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0007\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u0013\u001a\u00020\u0017*\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0007\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0013\u0010\u0019J)\u0010\u001a\u001a\u00020\u0017*\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0007\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J)\u0010\u001b\u001a\u00020\u0017*\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0007\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019JC\u0010\u001a\u001a\u00020\u0017*\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0007\u001a\u00020\u00172\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u001cH\u0002¢\u0006\u0004\b\u001a\u0010\u001dJC\u0010\u0018\u001a\u00020\u0017*\u00020\u00152\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\u0006\u0010\u0007\u001a\u00020\u00172\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\u001cH\u0002¢\u0006\u0004\b\u0018\u0010\u001dR \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\""}, d2 = {"Lo/withLenient;", "Lo/withTypeHandler;", "Lkotlin/Function1;", "Lo/calloc;", "", "p0", "", "p1", "", "p2", "Lo/getReturnTransition;", "p3", "<init>", "(Lo/getAnswerMap;ZFLo/getReturnTransition;)V", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "read", "(Lo/getValueHandler;Ljava/util/List;I)I", "RemoteActionCompatParcelizer", "write", "Lkotlin/Function2;", "(Lo/getValueHandler;Ljava/util/List;ILo/MagicModuleSubmissionRequestBody;)I", "Lo/getAnswerMap;", "IconCompatParcelizer", "Z", "F", "Lo/getReturnTransition;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class withLenient implements withTypeHandler {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;
    private final float RemoteActionCompatParcelizer;
    private final getReturnTransition read;
    private final getAnswerMap<calloc, getShowPopup> write;

    /* JADX WARN: Multi-variable type inference failed */
    public withLenient(getAnswerMap<? super calloc, getShowPopup> getanswermap, boolean z, float f, getReturnTransition getreturntransition) {
        this.write = getanswermap;
        this.AudioAttributesCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = f;
        this.read = getreturntransition;
    }

    @Override // kotlin.withTypeHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(final withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
        isTypeOrSuperTypeOf istypeorsupertypeof;
        isTypeOrSuperTypeOf istypeorsupertypeof2;
        int i;
        _parser _parserVarWrite;
        isTypeOrSuperTypeOf istypeorsupertypeof3;
        _parser _parserVar;
        List<? extends isTypeOrSuperTypeOf> list2;
        _parser _parserVar2;
        long jAudioAttributesCompatParcelizer;
        isTypeOrSuperTypeOf istypeorsupertypeof4;
        int iIconCompatParcelizer = withcontentvaluehandler.IconCompatParcelizer(this.read.getRemoteActionCompatParcelizer());
        long jAudioAttributesCompatParcelizer$default = PropertyValueAny.AudioAttributesCompatParcelizer$default(j, 0, 0, 0, 0, 10, null);
        List<? extends isTypeOrSuperTypeOf> list3 = list;
        int size = list3.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                istypeorsupertypeof = null;
                break;
            }
            istypeorsupertypeof = list.get(i2);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof), (Object) "Leading")) {
                break;
            }
            i2++;
        }
        isTypeOrSuperTypeOf istypeorsupertypeof5 = istypeorsupertypeof;
        _parser _parserVarWrite2 = istypeorsupertypeof5 != null ? istypeorsupertypeof5.write(jAudioAttributesCompatParcelizer$default) : null;
        int i3 = JsonFactory.read(_parserVarWrite2);
        int size2 = list3.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                istypeorsupertypeof2 = null;
                break;
            }
            istypeorsupertypeof2 = list.get(i4);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof2), (Object) "Trailing")) {
                break;
            }
            i4++;
        }
        isTypeOrSuperTypeOf istypeorsupertypeof6 = istypeorsupertypeof2;
        if (istypeorsupertypeof6 != null) {
            i = i3;
            _parserVarWrite = istypeorsupertypeof6.write(PropertyValueBuffer.IconCompatParcelizer$default(jAudioAttributesCompatParcelizer$default, -i3, 0, 2, null));
        } else {
            i = i3;
            _parserVarWrite = null;
        }
        int i5 = JsonFactory.read(_parserVarWrite);
        int iIconCompatParcelizer2 = withcontentvaluehandler.IconCompatParcelizer(this.read.read(withcontentvaluehandler.getAudioAttributesCompatParcelizer())) + withcontentvaluehandler.IconCompatParcelizer(this.read.RemoteActionCompatParcelizer(withcontentvaluehandler.getAudioAttributesCompatParcelizer()));
        int i6 = -(i + i5);
        int i7 = -iIconCompatParcelizer;
        long jIconCompatParcelizer = PropertyValueBuffer.IconCompatParcelizer(jAudioAttributesCompatParcelizer$default, AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(i6 - iIconCompatParcelizer2, -iIconCompatParcelizer2, this.RemoteActionCompatParcelizer), i7);
        int size3 = list3.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                istypeorsupertypeof3 = null;
                break;
            }
            istypeorsupertypeof3 = list.get(i8);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof3), (Object) "Label")) {
                break;
            }
            i8++;
        }
        isTypeOrSuperTypeOf istypeorsupertypeof7 = istypeorsupertypeof3;
        final _parser _parserVarWrite3 = istypeorsupertypeof7 != null ? istypeorsupertypeof7.write(jIconCompatParcelizer) : null;
        if (_parserVarWrite3 != null) {
            float read = _parserVarWrite3.getRead();
            float remoteActionCompatParcelizer = _parserVarWrite3.getRemoteActionCompatParcelizer();
            long jFloatToRawIntBits = Float.floatToRawIntBits(read);
            int iFloatToRawIntBits = Float.floatToRawIntBits(remoteActionCompatParcelizer);
            _parserVar = _parserVarWrite;
            _parserVar2 = _parserVarWrite2;
            list2 = list3;
            long j2 = -1;
            jAudioAttributesCompatParcelizer = calloc.write((((long) iFloatToRawIntBits) & ((j2 - ((j2 >> 63) << 32)) | (((long) 0) << 32))) | (jFloatToRawIntBits << 32));
        } else {
            _parserVar = _parserVarWrite;
            list2 = list3;
            _parserVar2 = _parserVarWrite2;
            jAudioAttributesCompatParcelizer = calloc.INSTANCE.AudioAttributesCompatParcelizer();
        }
        this.write.invoke(calloc.read(jAudioAttributesCompatParcelizer));
        long jAudioAttributesCompatParcelizer$default2 = PropertyValueAny.AudioAttributesCompatParcelizer$default(PropertyValueBuffer.IconCompatParcelizer(j, i6, i7 - Math.max(JsonFactory.RemoteActionCompatParcelizer(_parserVarWrite3) / 2, withcontentvaluehandler.IconCompatParcelizer(this.read.getRead()))), 0, 0, 0, 0, 11, null);
        int size4 = list2.size();
        for (int i9 = 0; i9 < size4; i9++) {
            isTypeOrSuperTypeOf istypeorsupertypeof8 = list.get(i9);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof8), (Object) "TextField")) {
                final _parser _parserVarWrite4 = istypeorsupertypeof8.write(jAudioAttributesCompatParcelizer$default2);
                long jAudioAttributesCompatParcelizer$default3 = PropertyValueAny.AudioAttributesCompatParcelizer$default(jAudioAttributesCompatParcelizer$default2, 0, 0, 0, 0, 14, null);
                int size5 = list2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size5) {
                        istypeorsupertypeof4 = null;
                        break;
                    }
                    istypeorsupertypeof4 = list.get(i10);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof4), (Object) "Hint")) {
                        break;
                    }
                    i10++;
                }
                isTypeOrSuperTypeOf istypeorsupertypeof9 = istypeorsupertypeof4;
                _parser _parserVarWrite5 = istypeorsupertypeof9 != null ? istypeorsupertypeof9.write(jAudioAttributesCompatParcelizer$default3) : null;
                final int iAudioAttributesCompatParcelizer = getFeature.AudioAttributesCompatParcelizer(JsonFactory.read(_parserVar2), JsonFactory.read(_parserVar), _parserVarWrite4.getRead(), JsonFactory.read(_parserVarWrite3), JsonFactory.read(_parserVarWrite5), this.RemoteActionCompatParcelizer, j, withcontentvaluehandler.getRead(), this.read);
                final int iIconCompatParcelizer3 = getFeature.IconCompatParcelizer(JsonFactory.RemoteActionCompatParcelizer(_parserVar2), JsonFactory.RemoteActionCompatParcelizer(_parserVar), _parserVarWrite4.getRemoteActionCompatParcelizer(), JsonFactory.RemoteActionCompatParcelizer(_parserVarWrite3), JsonFactory.RemoteActionCompatParcelizer(_parserVarWrite5), this.RemoteActionCompatParcelizer, j, withcontentvaluehandler.getRead(), this.read);
                int size6 = list2.size();
                for (int i11 = 0; i11 < size6; i11++) {
                    isTypeOrSuperTypeOf istypeorsupertypeof10 = list.get(i11);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof10), (Object) "border")) {
                        final _parser _parserVarWrite6 = istypeorsupertypeof10.write(PropertyValueBuffer.read(iAudioAttributesCompatParcelizer != Integer.MAX_VALUE ? iAudioAttributesCompatParcelizer : 0, iAudioAttributesCompatParcelizer, iIconCompatParcelizer3 != Integer.MAX_VALUE ? iIconCompatParcelizer3 : 0, iIconCompatParcelizer3));
                        final _parser _parserVar3 = _parserVar2;
                        final _parser _parserVar4 = _parserVar;
                        final _parser _parserVar5 = _parserVarWrite5;
                        return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, iAudioAttributesCompatParcelizer, iIconCompatParcelizer3, null, new getAnswerMap() { // from class: o.hasTimeZone
                            @Override // kotlin.getAnswerMap
                            public final Object invoke(Object obj) {
                                return withLenient.RemoteActionCompatParcelizer(iIconCompatParcelizer3, iAudioAttributesCompatParcelizer, _parserVar3, _parserVar4, _parserVarWrite4, _parserVarWrite3, _parserVar5, _parserVarWrite6, this, withcontentvaluehandler, (_parser.IconCompatParcelizer) obj);
                            }
                        }, 4, null);
                    }
                }
                ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer("Collection contains no element matching the predicate.");
                throw new PlanDetailsCreator();
            }
        }
        ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer("Collection contains no element matching the predicate.");
        throw new PlanDetailsCreator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(int i, int i2, _parser _parserVar, _parser _parserVar2, _parser _parserVar3, _parser _parserVar4, _parser _parserVar5, _parser _parserVar6, withLenient withlenient, withContentValueHandler withcontentvaluehandler, _parser.IconCompatParcelizer iconCompatParcelizer) {
        getFeature.AudioAttributesCompatParcelizer(iconCompatParcelizer, i, i2, _parserVar, _parserVar2, _parserVar3, _parserVar4, _parserVar5, _parserVar6, withlenient.RemoteActionCompatParcelizer, withlenient.AudioAttributesCompatParcelizer, withcontentvaluehandler.getRead(), withcontentvaluehandler.getAudioAttributesCompatParcelizer(), withlenient.read);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.withTypeHandler
    public final int read(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return read(getvaluehandler, list, i, new MagicModuleSubmissionRequestBody() { // from class: o.scope
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(withLenient.AudioAttributesCompatParcelizer((hasHandlers) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesCompatParcelizer(hasHandlers hashandlers, int i) {
        return hashandlers.IconCompatParcelizer(i);
    }

    @Override // kotlin.withTypeHandler
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return read(getvaluehandler, list, i, new MagicModuleSubmissionRequestBody() { // from class: o.generator
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(withLenient.AudioAttributesImplApi26Parcelizer((hasHandlers) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesImplApi26Parcelizer(hasHandlers hashandlers, int i) {
        return hashandlers.read(i);
    }

    @Override // kotlin.withTypeHandler
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return RemoteActionCompatParcelizer(getvaluehandler, list, i, new MagicModuleSubmissionRequestBody() { // from class: o.JsonIdentityInfo
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(withLenient.MediaBrowserCompatCustomActionResultReceiver((hasHandlers) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MediaBrowserCompatCustomActionResultReceiver(hasHandlers hashandlers, int i) {
        return hashandlers.write(i);
    }

    @Override // kotlin.withTypeHandler
    public final int write(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return RemoteActionCompatParcelizer(getvaluehandler, list, i, new MagicModuleSubmissionRequestBody() { // from class: o.JsonGetter
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(withLenient.AudioAttributesImplBaseParcelizer((hasHandlers) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesImplBaseParcelizer(hasHandlers hashandlers, int i) {
        return hashandlers.AudioAttributesCompatParcelizer(i);
    }

    private final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i, MagicModuleSubmissionRequestBody<? super hasHandlers, ? super Integer, Integer> magicModuleSubmissionRequestBody) {
        hasHandlers hashandlers;
        hasHandlers hashandlers2;
        hasHandlers hashandlers3;
        hasHandlers hashandlers4;
        List<? extends hasHandlers> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            hasHandlers hashandlers5 = list.get(i2);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers5), (Object) "TextField")) {
                int iIntValue = magicModuleSubmissionRequestBody.invoke(hashandlers5, Integer.valueOf(i)).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    hashandlers = null;
                    if (i3 >= size2) {
                        hashandlers2 = null;
                        break;
                    }
                    hashandlers2 = list.get(i3);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers2), (Object) "Label")) {
                        break;
                    }
                    i3++;
                }
                hasHandlers hashandlers6 = hashandlers2;
                int iIntValue2 = hashandlers6 != null ? magicModuleSubmissionRequestBody.invoke(hashandlers6, Integer.valueOf(i)).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        hashandlers3 = null;
                        break;
                    }
                    hashandlers3 = list.get(i4);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers3), (Object) "Trailing")) {
                        break;
                    }
                    i4++;
                }
                hasHandlers hashandlers7 = hashandlers3;
                int iIntValue3 = hashandlers7 != null ? magicModuleSubmissionRequestBody.invoke(hashandlers7, Integer.valueOf(i)).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        hashandlers4 = null;
                        break;
                    }
                    hashandlers4 = list.get(i5);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers4), (Object) "Leading")) {
                        break;
                    }
                    i5++;
                }
                hasHandlers hashandlers8 = hashandlers4;
                int iIntValue4 = hashandlers8 != null ? magicModuleSubmissionRequestBody.invoke(hashandlers8, Integer.valueOf(i)).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    hasHandlers hashandlers9 = list.get(i6);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers9), (Object) "Hint")) {
                        hashandlers = hashandlers9;
                        break;
                    }
                    i6++;
                }
                hasHandlers hashandlers10 = hashandlers;
                return getFeature.AudioAttributesCompatParcelizer(iIntValue4, iIntValue3, iIntValue, iIntValue2, hashandlers10 != null ? magicModuleSubmissionRequestBody.invoke(hashandlers10, Integer.valueOf(i)).intValue() : 0, this.RemoteActionCompatParcelizer, PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null), getvaluehandler.getRead(), this.read);
            }
        }
        ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer("Collection contains no element matching the predicate.");
        throw new PlanDetailsCreator();
    }

    private final int read(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i, MagicModuleSubmissionRequestBody<? super hasHandlers, ? super Integer, Integer> magicModuleSubmissionRequestBody) {
        hasHandlers hashandlers;
        hasHandlers hashandlers2;
        int iIconCompatParcelizer;
        int iIntValue;
        hasHandlers hashandlers3;
        int iIntValue2;
        hasHandlers hashandlers4;
        List<? extends hasHandlers> list2 = list;
        int size = list2.size();
        int i2 = 0;
        while (true) {
            hashandlers = null;
            if (i2 >= size) {
                hashandlers2 = null;
                break;
            }
            hashandlers2 = list.get(i2);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers2), (Object) "Leading")) {
                break;
            }
            i2++;
        }
        hasHandlers hashandlers5 = hashandlers2;
        if (hashandlers5 != null) {
            iIconCompatParcelizer = flush.IconCompatParcelizer(i, hashandlers5.write(Integer.MAX_VALUE));
            iIntValue = magicModuleSubmissionRequestBody.invoke(hashandlers5, Integer.valueOf(i)).intValue();
        } else {
            iIconCompatParcelizer = i;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                hashandlers3 = null;
                break;
            }
            hashandlers3 = list.get(i3);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers3), (Object) "Trailing")) {
                break;
            }
            i3++;
        }
        hasHandlers hashandlers6 = hashandlers3;
        if (hashandlers6 != null) {
            iIconCompatParcelizer = flush.IconCompatParcelizer(iIconCompatParcelizer, hashandlers6.write(Integer.MAX_VALUE));
            iIntValue2 = magicModuleSubmissionRequestBody.invoke(hashandlers6, Integer.valueOf(i)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                hashandlers4 = null;
                break;
            }
            hashandlers4 = list.get(i4);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers4), (Object) "Label")) {
                break;
            }
            i4++;
        }
        hasHandlers hashandlers7 = hashandlers4;
        int iIntValue3 = hashandlers7 != null ? magicModuleSubmissionRequestBody.invoke(hashandlers7, Integer.valueOf(AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(iIconCompatParcelizer, i, this.RemoteActionCompatParcelizer))).intValue() : 0;
        int size4 = list2.size();
        for (int i5 = 0; i5 < size4; i5++) {
            hasHandlers hashandlers8 = list.get(i5);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers8), (Object) "TextField")) {
                int iIntValue4 = magicModuleSubmissionRequestBody.invoke(hashandlers8, Integer.valueOf(iIconCompatParcelizer)).intValue();
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        break;
                    }
                    hasHandlers hashandlers9 = list.get(i6);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers9), (Object) "Hint")) {
                        hashandlers = hashandlers9;
                        break;
                    }
                    i6++;
                }
                hasHandlers hashandlers10 = hashandlers;
                return getFeature.IconCompatParcelizer(iIntValue, iIntValue2, iIntValue4, iIntValue3, hashandlers10 != null ? magicModuleSubmissionRequestBody.invoke(hashandlers10, Integer.valueOf(iIconCompatParcelizer)).intValue() : 0, this.RemoteActionCompatParcelizer, PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null), getvaluehandler.getRead(), this.read);
            }
        }
        ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer("Collection contains no element matching the predicate.");
        throw new PlanDetailsCreator();
    }
}
