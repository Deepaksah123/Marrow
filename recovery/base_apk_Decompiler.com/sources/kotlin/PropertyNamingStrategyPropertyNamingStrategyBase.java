package kotlin;

import android.content.res.Resources;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin._handleApos;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a)\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u000e\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0004\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u0002*\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u001b\u0010\u001d\u001a\u00020\u0002*\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\u0002*\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u001a\u001a!\u0010\u001d\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030 2\b\u0010\u0003\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b\u001d\u0010\"\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00108CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u001a"}, d2 = {"Lo/_assertNotNull;", "Lkotlin/Function1;", "", "p0", "RemoteActionCompatParcelizer", "(Lo/_assertNotNull;Lo/getAnswerMap;)Lo/_assertNotNull;", "Lo/setExpandedActionViewsExclusive;", "Lo/JsonNodeFeature;", "Lo/setExpandActivityOverflowButtonContentDescription;", "p1", "p2", "Landroid/content/res/Resources;", "p3", "", "read", "(Lo/setExpandedActionViewsExclusive;Lo/setExpandActivityOverflowButtonContentDescription;Lo/setExpandActivityOverflowButtonContentDescription;Landroid/content/res/Resources;)V", "Lo/valueInstantiatorInstance;", "AudioAttributesCompatParcelizer", "(Lo/valueInstantiatorInstance;Landroid/content/res/Resources;)Z", "Lo/AbstractDeserializer;", "AudioAttributesImplBaseParcelizer", "(Lo/valueInstantiatorInstance;)Lo/AbstractDeserializer;", "", "write", "(Lo/valueInstantiatorInstance;Landroid/content/res/Resources;)Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "(Lo/valueInstantiatorInstance;)Z", "AudioAttributesImplApi26Parcelizer", "Lo/valueInstantiators;", "IconCompatParcelizer", "(Lo/valueInstantiatorInstance;Lo/valueInstantiators;)Z", "AudioAttributesImplApi21Parcelizer", "Lo/defaultFeatures;", "", "(Lo/defaultFeatures;Ljava/lang/Object;)Z", "MediaBrowserCompatCustomActionResultReceiver"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PropertyNamingStrategyPropertyNamingStrategyBase {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[MutableCoercionConfig.values().length];
            try {
                iArr[MutableCoercionConfig.IconCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MutableCoercionConfig.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MutableCoercionConfig.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            read = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _assertNotNull RemoteActionCompatParcelizer(_assertNotNull _assertnotnull, getAnswerMap<? super _assertNotNull, Boolean> getanswermap) {
        for (_assertNotNull _assertnotnull_init_lambda4 = _assertnotnull._init_lambda4(); _assertnotnull_init_lambda4 != null; _assertnotnull_init_lambda4 = _assertnotnull_init_lambda4._init_lambda4()) {
            if (getanswermap.invoke(_assertnotnull_init_lambda4).booleanValue()) {
                return _assertnotnull_init_lambda4;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(setExpandedActionViewsExclusive<JsonNodeFeature> setexpandedactionviewsexclusive, setExpandActivityOverflowButtonContentDescription setexpandactivityoverflowbuttoncontentdescription, setExpandActivityOverflowButtonContentDescription setexpandactivityoverflowbuttoncontentdescription2, Resources resources) {
        setexpandactivityoverflowbuttoncontentdescription.AudioAttributesCompatParcelizer();
        setexpandactivityoverflowbuttoncontentdescription2.AudioAttributesCompatParcelizer();
        JsonNodeFeature jsonNodeFeatureAudioAttributesCompatParcelizer = setexpandedactionviewsexclusive.AudioAttributesCompatParcelizer(-1);
        valueInstantiatorInstance remoteActionCompatParcelizer = jsonNodeFeatureAudioAttributesCompatParcelizer != null ? jsonNodeFeatureAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer() : null;
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer);
        List<valueInstantiatorInstance> listIconCompatParcelizer = introspectClassAnnotations.IconCompatParcelizer(remoteActionCompatParcelizer, new AnonymousClass3(setexpandedactionviewsexclusive), new AnonymousClass5(resources), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(remoteActionCompatParcelizer));
        int iWrite = IntermediateLoginResponseBody.write((List) listIconCompatParcelizer);
        if (iWrite <= 0) {
            return;
        }
        int i = 1;
        while (true) {
            int audioAttributesImplApi21Parcelizer = listIconCompatParcelizer.get(i - 1).getAudioAttributesImplApi21Parcelizer();
            int audioAttributesImplApi21Parcelizer2 = listIconCompatParcelizer.get(i).getAudioAttributesImplApi21Parcelizer();
            setexpandactivityoverflowbuttoncontentdescription.IconCompatParcelizer(audioAttributesImplApi21Parcelizer, audioAttributesImplApi21Parcelizer2);
            setexpandactivityoverflowbuttoncontentdescription2.IconCompatParcelizer(audioAttributesImplApi21Parcelizer2, audioAttributesImplApi21Parcelizer);
            if (i == iWrite) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: o.PropertyNamingStrategyPropertyNamingStrategyBase$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/valueInstantiatorInstance;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/valueInstantiatorInstance;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<valueInstantiatorInstance, Boolean> {
        final /* synthetic */ setExpandedActionViewsExclusive<JsonNodeFeature> $read;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(valueInstantiatorInstance valueinstantiatorinstance) {
            return Boolean.valueOf(this.$read.IconCompatParcelizer(valueinstantiatorinstance.getAudioAttributesImplApi21Parcelizer()));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(setExpandedActionViewsExclusive<JsonNodeFeature> setexpandedactionviewsexclusive) {
            super(1);
            this.$read = setexpandedactionviewsexclusive;
        }
    }

    /* JADX INFO: renamed from: o.PropertyNamingStrategyPropertyNamingStrategyBase$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/valueInstantiatorInstance;", "p0", "", "AudioAttributesCompatParcelizer", "(Lo/valueInstantiatorInstance;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<valueInstantiatorInstance, Boolean> {
        final /* synthetic */ Resources $RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(valueInstantiatorInstance valueinstantiatorinstance) {
            return Boolean.valueOf(PropertyNamingStrategyPropertyNamingStrategyBase.AudioAttributesCompatParcelizer(valueinstantiatorinstance, this.$RemoteActionCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(Resources resources) {
            super(1);
            this.$RemoteActionCompatParcelizer = resources;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance, Resources resources) {
        List list = (List) withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.IconCompatParcelizer());
        return !addModule.write(valueinstantiatorinstance) && (valueinstantiatorinstance.getWrite().getRead() || (valueinstantiatorinstance.onCommand() && ((list != null ? (String) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list) : null) != null || AudioAttributesImplBaseParcelizer(valueinstantiatorinstance) != null || write(valueinstantiatorinstance, resources) != null || MediaBrowserCompatItemReceiver(valueinstantiatorinstance))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractDeserializer AudioAttributesImplBaseParcelizer(valueInstantiatorInstance valueinstantiatorinstance) {
        AbstractDeserializer abstractDeserializer = (AbstractDeserializer) withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.AudioAttributesImplApi26Parcelizer());
        List list = (List) withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.onSetRating());
        return abstractDeserializer == null ? list != null ? (AbstractDeserializer) IntermediateLoginResponseBody.MediaBrowserCompatSearchResultReceiver(list) : null : abstractDeserializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String write(valueInstantiatorInstance valueinstantiatorinstance, Resources resources) {
        int iWrite;
        Object objRemoteActionCompatParcelizer = withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.onRemoveQueueItemAt());
        MutableCoercionConfig mutableCoercionConfig = (MutableCoercionConfig) withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.onSetRepeatMode());
        C0184keyDeserializers c0184keyDeserializers = (C0184keyDeserializers) withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.onRemoveQueueItem());
        if (mutableCoercionConfig != null) {
            int i = WhenMappings.read[mutableCoercionConfig.ordinal()];
            if (i == 1) {
                int iAudioAttributesImplApi26Parcelizer = C0184keyDeserializers.INSTANCE.AudioAttributesImplApi26Parcelizer();
                if (c0184keyDeserializers != null && C0184keyDeserializers.IconCompatParcelizer(c0184keyDeserializers.getWrite(), iAudioAttributesImplApi26Parcelizer) && objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = resources.getString(_handleApos.IconCompatParcelizer.state_on);
                }
            } else if (i == 2) {
                int iAudioAttributesImplApi26Parcelizer2 = C0184keyDeserializers.INSTANCE.AudioAttributesImplApi26Parcelizer();
                if (c0184keyDeserializers != null && C0184keyDeserializers.IconCompatParcelizer(c0184keyDeserializers.getWrite(), iAudioAttributesImplApi26Parcelizer2) && objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = resources.getString(_handleApos.IconCompatParcelizer.state_off);
                }
            } else {
                if (i != 3) {
                    throw new RenewEligibleCreator();
                }
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = resources.getString(_handleApos.IconCompatParcelizer.indeterminate);
                }
            }
        }
        Boolean bool = (Boolean) withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.onPrepareFromUri());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            int iMediaBrowserCompatItemReceiver = C0184keyDeserializers.INSTANCE.MediaBrowserCompatItemReceiver();
            if ((c0184keyDeserializers == null || !C0184keyDeserializers.IconCompatParcelizer(c0184keyDeserializers.getWrite(), iMediaBrowserCompatItemReceiver)) && objRemoteActionCompatParcelizer == null) {
                if (zBooleanValue) {
                    objRemoteActionCompatParcelizer = resources.getString(_handleApos.IconCompatParcelizer.selected);
                } else {
                    objRemoteActionCompatParcelizer = resources.getString(_handleApos.IconCompatParcelizer.not_selected);
                }
            }
        }
        hasValueInstantiators hasvalueinstantiators = (hasValueInstantiators) withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.onPlayFromUri());
        if (hasvalueinstantiators != null) {
            if (hasvalueinstantiators != hasValueInstantiators.INSTANCE.read()) {
                if (objRemoteActionCompatParcelizer == null) {
                    initEncryptedContent<Float> initencryptedcontentAudioAttributesCompatParcelizer = hasvalueinstantiators.AudioAttributesCompatParcelizer();
                    float remoteActionCompatParcelizer = initencryptedcontentAudioAttributesCompatParcelizer.IconCompatParcelizer().floatValue() - initencryptedcontentAudioAttributesCompatParcelizer.write().floatValue() == BitmapDescriptorFactory.HUE_RED ? 0.0f : (hasvalueinstantiators.getRemoteActionCompatParcelizer() - initencryptedcontentAudioAttributesCompatParcelizer.write().floatValue()) / (initencryptedcontentAudioAttributesCompatParcelizer.IconCompatParcelizer().floatValue() - initencryptedcontentAudioAttributesCompatParcelizer.write().floatValue());
                    if (remoteActionCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
                        remoteActionCompatParcelizer = 0.0f;
                    }
                    if (remoteActionCompatParcelizer > 1.0f) {
                        remoteActionCompatParcelizer = 1.0f;
                    }
                    if (remoteActionCompatParcelizer == BitmapDescriptorFactory.HUE_RED) {
                        iWrite = 0;
                    } else {
                        iWrite = remoteActionCompatParcelizer == 1.0f ? 100 : getQues.write(Math.round(remoteActionCompatParcelizer * 100.0f), 1, 99);
                    }
                    objRemoteActionCompatParcelizer = resources.getString(_handleApos.IconCompatParcelizer.template_percent, Integer.valueOf(iWrite));
                }
            } else if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = resources.getString(_handleApos.IconCompatParcelizer.in_progress);
            }
        }
        if (valueinstantiatorinstance.getWrite().read(_this.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
            objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(valueinstantiatorinstance, resources);
        }
        return (String) objRemoteActionCompatParcelizer;
    }

    private static final String RemoteActionCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance, Resources resources) {
        C0216valueInstantiators c0216valueInstantiatorsAudioAttributesImplBaseParcelizer = valueinstantiatorinstance.read().AudioAttributesImplBaseParcelizer();
        Collection collection = (Collection) withDeserializerModifier.read(c0216valueInstantiatorsAudioAttributesImplBaseParcelizer, _this.INSTANCE.IconCompatParcelizer());
        if (collection != null && !collection.isEmpty()) {
            return null;
        }
        Collection collection2 = (Collection) withDeserializerModifier.read(c0216valueInstantiatorsAudioAttributesImplBaseParcelizer, _this.INSTANCE.onSetRating());
        if (collection2 != null && !collection2.isEmpty()) {
            return null;
        }
        CharSequence charSequence = (CharSequence) withDeserializerModifier.read(c0216valueInstantiatorsAudioAttributesImplBaseParcelizer, _this.INSTANCE.AudioAttributesImplApi26Parcelizer());
        if (charSequence == null || charSequence.length() == 0) {
            return resources.getString(_handleApos.IconCompatParcelizer.state_empty);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatItemReceiver(valueInstantiatorInstance valueinstantiatorinstance) {
        MutableCoercionConfig mutableCoercionConfig = (MutableCoercionConfig) withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.onSetRepeatMode());
        C0184keyDeserializers c0184keyDeserializers = (C0184keyDeserializers) withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.onRemoveQueueItem());
        boolean z = mutableCoercionConfig != null;
        if (((Boolean) withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.onPrepareFromUri())) != null) {
            int iMediaBrowserCompatItemReceiver = C0184keyDeserializers.INSTANCE.MediaBrowserCompatItemReceiver();
            if (c0184keyDeserializers == null || !C0184keyDeserializers.IconCompatParcelizer(c0184keyDeserializers.getWrite(), iMediaBrowserCompatItemReceiver)) {
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplApi26Parcelizer(valueInstantiatorInstance valueinstantiatorinstance) {
        return !valueinstantiatorinstance.AudioAttributesImplBaseParcelizer().read(_this.INSTANCE.MediaBrowserCompatItemReceiver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(valueInstantiatorInstance valueinstantiatorinstance, C0216valueInstantiators c0216valueInstantiators) {
        Iterator<Map.Entry<? extends MapperConfig<?>, ? extends Object>> it = c0216valueInstantiators.iterator();
        while (it.hasNext()) {
            if (!valueinstantiatorinstance.AudioAttributesImplBaseParcelizer().read(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatCustomActionResultReceiver(valueInstantiatorInstance valueinstantiatorinstance) {
        return valueinstantiatorinstance.MediaBrowserCompatCustomActionResultReceiver().getOnStop() == tryToResolveUnresolved.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplApi21Parcelizer(valueInstantiatorInstance valueinstantiatorinstance) {
        boolean z = valueinstantiatorinstance.getWrite().read(_this.INSTANCE.AudioAttributesImplApi26Parcelizer());
        Boolean bool = Boolean.TRUE;
        if (z && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(withDeserializerModifier.read(valueinstantiatorinstance.getWrite(), _this.INSTANCE.AudioAttributesImplBaseParcelizer()), bool)) {
            return true;
        }
        _assertNotNull _assertnotnullRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(valueinstantiatorinstance.getIconCompatParcelizer(), AnonymousClass1.RemoteActionCompatParcelizer);
        if (_assertnotnullRemoteActionCompatParcelizer == null) {
            return false;
        }
        C0216valueInstantiators c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp = _assertnotnullRemoteActionCompatParcelizer.accessgetReportFullyDrawnExecutorp();
        return c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(withDeserializerModifier.read(c0216valueInstantiatorsAccessgetReportFullyDrawnExecutorp, _this.INSTANCE.AudioAttributesImplBaseParcelizer()), bool);
    }

    /* JADX INFO: renamed from: o.PropertyNamingStrategyPropertyNamingStrategyBase$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_assertNotNull;", "p0", "", "write", "(Lo/_assertNotNull;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<_assertNotNull, Boolean> {
        public static final AnonymousClass1 RemoteActionCompatParcelizer = new AnonymousClass1();

        /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(kotlin._assertNotNull r2) {
            /*
                r1 = this;
                o.valueInstantiators r1 = r2.accessgetReportFullyDrawnExecutorp()
                if (r1 == 0) goto L19
                boolean r2 = r1.getRead()
                r0 = 1
                if (r2 != r0) goto L19
                o._this r2 = kotlin._this.INSTANCE
                o.MapperConfig r2 = r2.AudioAttributesImplApi26Parcelizer()
                boolean r1 = r1.read(r2)
                if (r1 != 0) goto L1a
            L19:
                r0 = 0
            L1a:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.PropertyNamingStrategyPropertyNamingStrategyBase.AnonymousClass1.invoke(o._assertNotNull):java.lang.Boolean");
        }

        AnonymousClass1() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean IconCompatParcelizer(defaultFeatures<?> defaultfeatures, Object obj) {
        if (defaultfeatures == obj) {
            return true;
        }
        if (!(obj instanceof defaultFeatures)) {
            return false;
        }
        defaultFeatures defaultfeatures2 = (defaultFeatures) obj;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) defaultfeatures.getRemoteActionCompatParcelizer(), (Object) defaultfeatures2.getRemoteActionCompatParcelizer())) {
            return false;
        }
        if (defaultfeatures.RemoteActionCompatParcelizer() != null || defaultfeatures2.RemoteActionCompatParcelizer() == null) {
            return defaultfeatures.RemoteActionCompatParcelizer() == null || defaultfeatures2.RemoteActionCompatParcelizer() != null;
        }
        return false;
    }
}
