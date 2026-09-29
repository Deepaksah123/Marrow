package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin._parser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\u000e*\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0005\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u000f\u001a\u00020\u0013*\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0005\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u000f\u0010\u0015J)\u0010\u0016\u001a\u00020\u0013*\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0005\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J)\u0010\u0017\u001a\u00020\u0013*\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0005\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J?\u0010\u0014\u001a\u00020\u00132\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0005\u001a\u00020\u00132\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0018H\u0002¢\u0006\u0004\b\u0014\u0010\u0019JC\u0010\u000f\u001a\u00020\u0013*\u00020\u00112\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\u0005\u001a\u00020\u00132\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u0018H\u0002¢\u0006\u0004\b\u000f\u0010\u001aR\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lo/enabledByDefault;", "Lo/withTypeHandler;", "", "p0", "", "p1", "Lo/getReturnTransition;", "p2", "<init>", "(ZFLo/getReturnTransition;)V", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "read", "(Lo/getValueHandler;Ljava/util/List;I)I", "RemoteActionCompatParcelizer", "write", "Lkotlin/Function2;", "(Ljava/util/List;ILo/MagicModuleSubmissionRequestBody;)I", "(Lo/getValueHandler;Ljava/util/List;ILo/MagicModuleSubmissionRequestBody;)I", "Z", "F", "IconCompatParcelizer", "Lo/getReturnTransition;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class enabledByDefault implements withTypeHandler {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getReturnTransition write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    public enabledByDefault(boolean z, float f, getReturnTransition getreturntransition) {
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = f;
        this.write = getreturntransition;
    }

    @Override // kotlin.withTypeHandler
    public final withHandlersFrom AudioAttributesCompatParcelizer(final withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
        isTypeOrSuperTypeOf istypeorsupertypeof;
        isTypeOrSuperTypeOf istypeorsupertypeof2;
        int i;
        long j2;
        final _parser _parserVarWrite;
        isTypeOrSuperTypeOf istypeorsupertypeof3;
        int iAudioAttributesCompatParcelizer;
        isTypeOrSuperTypeOf istypeorsupertypeof4;
        final int iIconCompatParcelizer = withcontentvaluehandler.IconCompatParcelizer(this.write.getRead());
        int iIconCompatParcelizer2 = withcontentvaluehandler.IconCompatParcelizer(this.write.getRemoteActionCompatParcelizer());
        final int iIconCompatParcelizer3 = withcontentvaluehandler.IconCompatParcelizer(_getBufferRecycler.RemoteActionCompatParcelizer());
        long jAudioAttributesCompatParcelizer$default = PropertyValueAny.AudioAttributesCompatParcelizer$default(j, 0, 0, 0, 0, 10, null);
        List<? extends isTypeOrSuperTypeOf> list2 = list;
        int size = list2.size();
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
        int size2 = list2.size();
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
            j2 = jAudioAttributesCompatParcelizer$default;
            _parserVarWrite = istypeorsupertypeof6.write(PropertyValueBuffer.IconCompatParcelizer$default(jAudioAttributesCompatParcelizer$default, -i3, 0, 2, null));
        } else {
            i = i3;
            j2 = jAudioAttributesCompatParcelizer$default;
            _parserVarWrite = null;
        }
        int i5 = -iIconCompatParcelizer2;
        int i6 = -(i + JsonFactory.read(_parserVarWrite));
        long jIconCompatParcelizer = PropertyValueBuffer.IconCompatParcelizer(j2, i6, i5);
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                istypeorsupertypeof3 = null;
                break;
            }
            istypeorsupertypeof3 = list.get(i7);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof3), (Object) "Label")) {
                break;
            }
            i7++;
        }
        isTypeOrSuperTypeOf istypeorsupertypeof7 = istypeorsupertypeof3;
        _parser _parserVarWrite3 = istypeorsupertypeof7 != null ? istypeorsupertypeof7.write(jIconCompatParcelizer) : null;
        if (_parserVarWrite3 != null) {
            iAudioAttributesCompatParcelizer = _parserVarWrite3.AudioAttributesCompatParcelizer(wrongTokenException.IconCompatParcelizer());
            if (iAudioAttributesCompatParcelizer == Integer.MIN_VALUE) {
                iAudioAttributesCompatParcelizer = _parserVarWrite3.getRemoteActionCompatParcelizer();
            }
        } else {
            iAudioAttributesCompatParcelizer = 0;
        }
        final int iMax = Math.max(iAudioAttributesCompatParcelizer, iIconCompatParcelizer);
        long jIconCompatParcelizer2 = PropertyValueBuffer.IconCompatParcelizer(PropertyValueAny.AudioAttributesCompatParcelizer$default(j, 0, 0, 0, 0, 11, null), i6, _parserVarWrite3 != null ? (i5 - iIconCompatParcelizer3) - iMax : (-iIconCompatParcelizer) - iIconCompatParcelizer2);
        int size4 = list2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            isTypeOrSuperTypeOf istypeorsupertypeof8 = list.get(i8);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof8), (Object) "TextField")) {
                final _parser _parserVarWrite4 = istypeorsupertypeof8.write(jIconCompatParcelizer2);
                long jAudioAttributesCompatParcelizer$default2 = PropertyValueAny.AudioAttributesCompatParcelizer$default(jIconCompatParcelizer2, 0, 0, 0, 0, 14, null);
                int size5 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size5) {
                        istypeorsupertypeof4 = null;
                        break;
                    }
                    istypeorsupertypeof4 = list.get(i9);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(isEnumType.IconCompatParcelizer(istypeorsupertypeof4), (Object) "Hint")) {
                        break;
                    }
                    i9++;
                }
                isTypeOrSuperTypeOf istypeorsupertypeof9 = istypeorsupertypeof4;
                _parser _parserVarWrite5 = istypeorsupertypeof9 != null ? istypeorsupertypeof9.write(jAudioAttributesCompatParcelizer$default2) : null;
                final int iRemoteActionCompatParcelizer = _getBufferRecycler.RemoteActionCompatParcelizer(JsonFactory.read(_parserVarWrite2), JsonFactory.read(_parserVarWrite), _parserVarWrite4.getRead(), JsonFactory.read(_parserVarWrite3), JsonFactory.read(_parserVarWrite5), j);
                final int iIconCompatParcelizer4 = _getBufferRecycler.IconCompatParcelizer(_parserVarWrite4.getRemoteActionCompatParcelizer(), _parserVarWrite3 != null, iMax, JsonFactory.RemoteActionCompatParcelizer(_parserVarWrite2), JsonFactory.RemoteActionCompatParcelizer(_parserVarWrite), JsonFactory.RemoteActionCompatParcelizer(_parserVarWrite5), j, withcontentvaluehandler.getRead(), this.write);
                final _parser _parserVar = _parserVarWrite3;
                final int i10 = iAudioAttributesCompatParcelizer;
                final _parser _parserVar2 = _parserVarWrite5;
                final _parser _parserVar3 = _parserVarWrite2;
                return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, iRemoteActionCompatParcelizer, iIconCompatParcelizer4, null, new getAnswerMap() { // from class: o.JsonFactoryFeature
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return enabledByDefault.AudioAttributesCompatParcelizer(_parserVar, iIconCompatParcelizer, i10, iRemoteActionCompatParcelizer, iIconCompatParcelizer4, _parserVarWrite4, _parserVar2, _parserVar3, _parserVarWrite, this, iMax, iIconCompatParcelizer3, withcontentvaluehandler, (_parser.IconCompatParcelizer) obj);
                    }
                }, 4, null);
            }
        }
        ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer("Collection contains no element matching the predicate.");
        throw new PlanDetailsCreator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_parser _parserVar, int i, int i2, int i3, int i4, _parser _parserVar2, _parser _parserVar3, _parser _parserVar4, _parser _parserVar5, enabledByDefault enabledbydefault, int i5, int i6, withContentValueHandler withcontentvaluehandler, _parser.IconCompatParcelizer iconCompatParcelizer) {
        if (_parserVar == null) {
            _getBufferRecycler.IconCompatParcelizer(iconCompatParcelizer, i3, i4, _parserVar2, _parserVar3, _parserVar4, _parserVar5, enabledbydefault.RemoteActionCompatParcelizer, withcontentvaluehandler.getRead(), enabledbydefault.write);
        } else {
            _getBufferRecycler.write(iconCompatParcelizer, i3, i4, _parserVar2, _parserVar, _parserVar3, _parserVar4, _parserVar5, enabledbydefault.RemoteActionCompatParcelizer, getQues.write(i - i2, 0), i5 + i6, enabledbydefault.IconCompatParcelizer, withcontentvaluehandler.getRead());
        }
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.withTypeHandler
    public final int read(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return AudioAttributesCompatParcelizer(getvaluehandler, list, i, new MagicModuleSubmissionRequestBody() { // from class: o.collectDefaults
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(enabledByDefault.IconCompatParcelizer((hasHandlers) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int IconCompatParcelizer(hasHandlers hashandlers, int i) {
        return hashandlers.IconCompatParcelizer(i);
    }

    @Override // kotlin.withTypeHandler
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return AudioAttributesCompatParcelizer(getvaluehandler, list, i, new MagicModuleSubmissionRequestBody() { // from class: o.setCodec
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(enabledByDefault.MediaBrowserCompatCustomActionResultReceiver((hasHandlers) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MediaBrowserCompatCustomActionResultReceiver(hasHandlers hashandlers, int i) {
        return hashandlers.read(i);
    }

    @Override // kotlin.withTypeHandler
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return read(list, i, new MagicModuleSubmissionRequestBody() { // from class: o.requiresPropertyOrdering
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(enabledByDefault.AudioAttributesImplApi26Parcelizer((hasHandlers) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesImplApi26Parcelizer(hasHandlers hashandlers, int i) {
        return hashandlers.write(i);
    }

    @Override // kotlin.withTypeHandler
    public final int write(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
        return read(list, i, new MagicModuleSubmissionRequestBody() { // from class: o.JsonGenerationException
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(enabledByDefault.AudioAttributesImplApi21Parcelizer((hasHandlers) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AudioAttributesImplApi21Parcelizer(hasHandlers hashandlers, int i) {
        return hashandlers.AudioAttributesCompatParcelizer(i);
    }

    private final int read(List<? extends hasHandlers> p0, int p1, MagicModuleSubmissionRequestBody<? super hasHandlers, ? super Integer, Integer> p2) {
        hasHandlers hashandlers;
        hasHandlers hashandlers2;
        hasHandlers hashandlers3;
        hasHandlers hashandlers4;
        List<? extends hasHandlers> list = p0;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            hasHandlers hashandlers5 = p0.get(i);
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers5), (Object) "TextField")) {
                int iIntValue = p2.invoke(hashandlers5, Integer.valueOf(p1)).intValue();
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    hashandlers = null;
                    if (i2 >= size2) {
                        hashandlers2 = null;
                        break;
                    }
                    hashandlers2 = p0.get(i2);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers2), (Object) "Label")) {
                        break;
                    }
                    i2++;
                }
                hasHandlers hashandlers6 = hashandlers2;
                int iIntValue2 = hashandlers6 != null ? p2.invoke(hashandlers6, Integer.valueOf(p1)).intValue() : 0;
                int size3 = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size3) {
                        hashandlers3 = null;
                        break;
                    }
                    hashandlers3 = p0.get(i3);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers3), (Object) "Trailing")) {
                        break;
                    }
                    i3++;
                }
                hasHandlers hashandlers7 = hashandlers3;
                int iIntValue3 = hashandlers7 != null ? p2.invoke(hashandlers7, Integer.valueOf(p1)).intValue() : 0;
                int size4 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size4) {
                        hashandlers4 = null;
                        break;
                    }
                    hashandlers4 = p0.get(i4);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers4), (Object) "Leading")) {
                        break;
                    }
                    i4++;
                }
                hasHandlers hashandlers8 = hashandlers4;
                int iIntValue4 = hashandlers8 != null ? p2.invoke(hashandlers8, Integer.valueOf(p1)).intValue() : 0;
                int size5 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size5) {
                        break;
                    }
                    hasHandlers hashandlers9 = p0.get(i5);
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(JsonFactory.read(hashandlers9), (Object) "Hint")) {
                        hashandlers = hashandlers9;
                        break;
                    }
                    i5++;
                }
                hasHandlers hashandlers10 = hashandlers;
                return _getBufferRecycler.RemoteActionCompatParcelizer(iIntValue4, iIntValue3, iIntValue, iIntValue2, hashandlers10 != null ? p2.invoke(hashandlers10, Integer.valueOf(p1)).intValue() : 0, PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null));
            }
        }
        ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer("Collection contains no element matching the predicate.");
        throw new PlanDetailsCreator();
    }

    private final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i, MagicModuleSubmissionRequestBody<? super hasHandlers, ? super Integer, Integer> magicModuleSubmissionRequestBody) {
        hasHandlers hashandlers;
        hasHandlers hashandlers2;
        int iIntValue;
        int iIconCompatParcelizer;
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
            iIntValue = 0;
            iIconCompatParcelizer = i;
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
        int iIntValue3 = hashandlers7 != null ? magicModuleSubmissionRequestBody.invoke(hashandlers7, Integer.valueOf(iIconCompatParcelizer)).intValue() : 0;
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
                return _getBufferRecycler.IconCompatParcelizer(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, hashandlers10 != null ? magicModuleSubmissionRequestBody.invoke(hashandlers10, Integer.valueOf(iIconCompatParcelizer)).intValue() : 0, PropertyValueBuffer.read$default(0, 0, 0, 0, 15, null), getvaluehandler.getRead(), this.write);
            }
        }
        ArrayBlockingQueueDeserializer.RemoteActionCompatParcelizer("Collection contains no element matching the predicate.");
        throw new PlanDetailsCreator();
    }
}
