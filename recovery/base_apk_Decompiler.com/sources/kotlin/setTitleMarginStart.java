package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001aT\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00042\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\t\u0010\n\u001av\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011\u001at\u0010\u0016\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00132 \b\u0002\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015\u0012\u0004\u0012\u00020\u00070\u0014H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017\u001aj\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\b\b\u0002\u0010\u0002\u001a\u00020\u00132 \b\u0002\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015\u0012\u0004\u0012\u00020\u00070\u0014H\u0086@¢\u0006\u0004\b\u0010\u0010\u0019\u001ap\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\b\b\u0002\u0010\u0002\u001a\u00020\u001b2 \b\u0002\u0010\u0003\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015\u0012\u0004\u0012\u00020\u00070\u0014H\u0080@¢\u0006\u0004\b\t\u0010\u001c\u001aJ\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001d\"\u0004\b\u0001\u0010\u000b\"\b\b\u0002\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001a2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00028\u00000\u0014H\u0082@¢\u0006\u0004\b\u001e\u0010\u001f\u001aC\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0000¢\u0006\u0004\b \u0010!\u001a\u0087\u0001\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0001\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015\u0012\u0004\u0012\u00020\u00070\u0014H\u0002¢\u0006\u0004\b\u0010\u0010\"\u001a\u0087\u0001\u0010 \u001a\u00020\u0007\"\u0004\b\u0000\u0010\u000b\"\b\b\u0001\u0010\r*\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0001\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u001b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00122\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015\u0012\u0004\u0012\u00020\u00070\u0014H\u0002¢\u0006\u0004\b \u0010#\"\u0018\u0010\u0016\u001a\u00020\u0000*\u00020$8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010%"}, d2 = {"", "p0", "p1", "p2", "Lo/setOrientation;", "p3", "Lkotlin/Function2;", "", "p4", "AudioAttributesCompatParcelizer", "(FFFLo/setOrientation;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "T", "Lo/ScrollingTabContainerView;", "V", "Lo/evictionCount;", "p5", "IconCompatParcelizer", "(Lo/evictionCount;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lo/setOrientation;Lo/MagicModuleSubmissionRequestBody;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/setShowDividers;", "", "Lkotlin/Function1;", "Lo/setWeightSum;", "write", "(Lo/setShowDividers;Ljava/lang/Object;Lo/setOrientation;ZLo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/setOnCloseListener;", "(Lo/setShowDividers;Lo/setOnCloseListener;ZLo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "Lo/setMeasureWithLargestChildEnabled;", "", "(Lo/setShowDividers;Lo/setMeasureWithLargestChildEnabled;JLo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "R", "read", "(Lo/setMeasureWithLargestChildEnabled;Lo/getAnswerMap;Lo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "(Lo/setWeightSum;Lo/setShowDividers;)V", "(Lo/setWeightSum;JFLo/setMeasureWithLargestChildEnabled;Lo/setShowDividers;Lo/getAnswerMap;)V", "(Lo/setWeightSum;JJLo/setMeasureWithLargestChildEnabled;Lo/setShowDividers;Lo/getAnswerMap;)V", "Lo/CurrentQuery;", "(Lo/CurrentQuery;)F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setTitleMarginStart {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write<T, V extends ScrollingTabContainerView> extends getTotalMcq {
        Object AudioAttributesCompatParcelizer;
        /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
        Object IconCompatParcelizer;
        Object RemoteActionCompatParcelizer;
        Object read;
        int write;

        write(SampleVideos<? super write> sampleVideos) {
            super(sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            this.AudioAttributesImplApi26Parcelizer = obj;
            this.write |= Integer.MIN_VALUE;
            return setTitleMarginStart.AudioAttributesCompatParcelizer(null, null, 0L, null, this);
        }
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer$default(float f, float f2, float f3, setOrientation setorientation, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, SampleVideos sampleVideos, int i, Object obj) {
        float f4 = (i & 4) != 0 ? 0.0f : f3;
        if ((i & 8) != 0) {
            setorientation = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
        return AudioAttributesCompatParcelizer(f, f2, f4, setorientation, magicModuleSubmissionRequestBody, sampleVideos);
    }

    public static final Object AudioAttributesCompatParcelizer(float f, float f2, float f3, setOrientation<Float> setorientation, MagicModuleSubmissionRequestBody<? super Float, ? super Float, getShowPopup> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = IconCompatParcelizer(hitCount.RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda1.INSTANCE), QBankStatsResponse.write(f), QBankStatsResponse.write(f2), QBankStatsResponse.write(f3), setorientation, magicModuleSubmissionRequestBody, sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    public static final <T, V extends ScrollingTabContainerView> Object IconCompatParcelizer(final evictionCount<T, V> evictioncount, T t, T t2, T t3, setOrientation<T> setorientation, final MagicModuleSubmissionRequestBody<? super T, ? super T, getShowPopup> magicModuleSubmissionRequestBody, SampleVideos<? super getShowPopup> sampleVideos) {
        V vIconCompatParcelizer;
        if (t3 == null || (vIconCompatParcelizer = evictioncount.RemoteActionCompatParcelizer().invoke(t3)) == null) {
            vIconCompatParcelizer = SearchView.IconCompatParcelizer(evictioncount.RemoteActionCompatParcelizer().invoke(t));
        }
        Object objAudioAttributesCompatParcelizer$default = AudioAttributesCompatParcelizer$default(new setShowDividers(evictioncount, t, vIconCompatParcelizer, 0L, 0L, false, 56, null), new setLayoutResource(setorientation, evictioncount, t, t2, vIconCompatParcelizer), 0L, new getAnswerMap() { // from class: o.ToolbarLayoutParams
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setTitleMarginStart.IconCompatParcelizer(magicModuleSubmissionRequestBody, evictioncount, (setWeightSum) obj);
            }
        }, sampleVideos, 2, null);
        return objAudioAttributesCompatParcelizer$default == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer$default : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, evictionCount evictioncount, setWeightSum setweightsum) {
        magicModuleSubmissionRequestBody.invoke(setweightsum.write(), evictioncount.read().invoke(setweightsum.MediaBrowserCompatItemReceiver()));
        return getShowPopup.INSTANCE;
    }

    public static /* synthetic */ Object write$default(setShowDividers setshowdividers, Object obj, setOrientation setorientation, boolean z, getAnswerMap getanswermap, SampleVideos sampleVideos, int i, Object obj2) {
        if ((i & 2) != 0) {
            setorientation = setVerticalGravity.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
        }
        setOrientation setorientation2 = setorientation;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            getanswermap = new getAnswerMap() { // from class: o.setInflatedId
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj3) {
                    return setTitleMarginStart.AudioAttributesImplApi26Parcelizer((setWeightSum) obj3);
                }
            };
        }
        return write((setShowDividers<Object, V>) setshowdividers, obj, (setOrientation<Object>) setorientation2, z2, (getAnswerMap<? super setWeightSum<Object, V>, getShowPopup>) getanswermap, (SampleVideos<? super getShowPopup>) sampleVideos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(setWeightSum setweightsum) {
        return getShowPopup.INSTANCE;
    }

    public static final <T, V extends ScrollingTabContainerView> Object write(setShowDividers<T, V> setshowdividers, T t, setOrientation<T> setorientation, boolean z, getAnswerMap<? super setWeightSum<T, V>, getShowPopup> getanswermap, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(setshowdividers, new setLayoutResource(setorientation, setshowdividers.write(), setshowdividers.getRemoteActionCompatParcelizer(), t, setshowdividers.AudioAttributesImplApi21Parcelizer()), z ? setshowdividers.getRemoteActionCompatParcelizer() : Long.MIN_VALUE, getanswermap, sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    public static /* synthetic */ Object IconCompatParcelizer$default(setShowDividers setshowdividers, setOnCloseListener setoncloselistener, boolean z, getAnswerMap getanswermap, SampleVideos sampleVideos, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            getanswermap = new getAnswerMap() { // from class: o.ToolbarSavedState
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return setTitleMarginStart.write((setWeightSum) obj2);
                }
            };
        }
        return IconCompatParcelizer(setshowdividers, setoncloselistener, z, getanswermap, sampleVideos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(setWeightSum setweightsum) {
        return getShowPopup.INSTANCE;
    }

    public static final <T, V extends ScrollingTabContainerView> Object IconCompatParcelizer(setShowDividers<T, V> setshowdividers, setOnCloseListener<T> setoncloselistener, boolean z, getAnswerMap<? super setWeightSum<T, V>, getShowPopup> getanswermap, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(setshowdividers, new setImeOptions(setoncloselistener, setshowdividers.write(), setshowdividers.getRemoteActionCompatParcelizer(), setshowdividers.AudioAttributesImplApi21Parcelizer()), z ? setshowdividers.getRemoteActionCompatParcelizer() : Long.MIN_VALUE, getanswermap, sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r13v1, types: [T, o.setWeightSum] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T, V extends kotlin.ScrollingTabContainerView> java.lang.Object AudioAttributesCompatParcelizer(final kotlin.setShowDividers<T, V> r25, final kotlin.setMeasureWithLargestChildEnabled<T, V> r26, long r27, final kotlin.getAnswerMap<? super kotlin.setWeightSum<T, V>, kotlin.getShowPopup> r29, kotlin.SampleVideos<? super kotlin.getShowPopup> r30) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTitleMarginStart.AudioAttributesCompatParcelizer(o.setShowDividers, o.setMeasureWithLargestChildEnabled, long, o.getAnswerMap, o.SampleVideos):java.lang.Object");
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer$default(setShowDividers setshowdividers, setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled, long j, getAnswerMap getanswermap, SampleVideos sampleVideos, int i, Object obj) {
        if ((i & 2) != 0) {
            j = Long.MIN_VALUE;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            getanswermap = new getAnswerMap() { // from class: o.setTitleTextColor
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return setTitleMarginStart.RemoteActionCompatParcelizer((setWeightSum) obj2);
                }
            };
        }
        return AudioAttributesCompatParcelizer(setshowdividers, setmeasurewithlargestchildenabled, j2, getanswermap, sampleVideos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(setWeightSum setweightsum) {
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r14v0, types: [T, o.setWeightSum] */
    public static final getShowPopup write(MagicModuleUseCaseImplWhenMappings.write writeVar, Object obj, setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled, ScrollingTabContainerView scrollingTabContainerView, final setShowDividers setshowdividers, float f, getAnswerMap getanswermap, long j) {
        ?? setweightsum = new setWeightSum(obj, setmeasurewithlargestchildenabled.write(), scrollingTabContainerView, j, setmeasurewithlargestchildenabled.RemoteActionCompatParcelizer(), j, true, new getCreatedOnDateMs() { // from class: o.setTitleTextAppearance
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setTitleMarginStart.IconCompatParcelizer(setshowdividers);
            }
        });
        IconCompatParcelizer((setWeightSum) setweightsum, j, f, setmeasurewithlargestchildenabled, setshowdividers, getanswermap);
        writeVar.write = setweightsum;
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(setShowDividers setshowdividers) {
        setshowdividers.AudioAttributesCompatParcelizer(false);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(setShowDividers setshowdividers) {
        setshowdividers.AudioAttributesCompatParcelizer(false);
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final getShowPopup IconCompatParcelizer(MagicModuleUseCaseImplWhenMappings.write writeVar, float f, setMeasureWithLargestChildEnabled setmeasurewithlargestchildenabled, setShowDividers setshowdividers, getAnswerMap getanswermap, long j) {
        T t = writeVar.write;
        toMagicModuleMetaRepoModel.write(t);
        IconCompatParcelizer((setWeightSum) t, j, f, setmeasurewithlargestchildenabled, setshowdividers, getanswermap);
        return getShowPopup.INSTANCE;
    }

    private static final <R, T, V extends ScrollingTabContainerView> Object read(setMeasureWithLargestChildEnabled<T, V> setmeasurewithlargestchildenabled, final getAnswerMap<? super Long, ? extends R> getanswermap, SampleVideos<? super R> sampleVideos) {
        if (setmeasurewithlargestchildenabled.getMediaBrowserCompatItemReceiver()) {
            return setSwitchTypeface.write(getanswermap, sampleVideos);
        }
        return TokenFilterInclusion.AudioAttributesCompatParcelizer(new getAnswerMap() { // from class: o.setTitleMarginTop
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setTitleMarginStart.RemoteActionCompatParcelizer(getanswermap, ((Long) obj).longValue());
            }
        }, sampleVideos);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(getAnswerMap getanswermap, long j) {
        return getanswermap.invoke(Long.valueOf(j));
    }

    public static final float IconCompatParcelizer(CurrentQuery currentQuery) {
        _handleOddValue _handleoddvalue = (_handleOddValue) currentQuery.get(_handleOddValue.INSTANCE);
        float f = _handleoddvalue != null ? _handleoddvalue.read() : 1.0f;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            setCollapsible.IconCompatParcelizer("negative scale factor");
        }
        return f;
    }

    public static final <T, V extends ScrollingTabContainerView> void RemoteActionCompatParcelizer(setWeightSum<T, V> setweightsum, setShowDividers<T, V> setshowdividers) {
        setshowdividers.RemoteActionCompatParcelizer(setweightsum.write());
        SearchView.AudioAttributesCompatParcelizer(setshowdividers.AudioAttributesImplApi21Parcelizer(), setweightsum.MediaBrowserCompatItemReceiver());
        setshowdividers.RemoteActionCompatParcelizer(setweightsum.getAudioAttributesImplApi26Parcelizer());
        setshowdividers.write(setweightsum.getMediaBrowserCompatCustomActionResultReceiver());
        setshowdividers.AudioAttributesCompatParcelizer(setweightsum.AudioAttributesImplBaseParcelizer());
    }

    private static final <T, V extends ScrollingTabContainerView> void IconCompatParcelizer(setWeightSum<T, V> setweightsum, long j, float f, setMeasureWithLargestChildEnabled<T, V> setmeasurewithlargestchildenabled, setShowDividers<T, V> setshowdividers, getAnswerMap<? super setWeightSum<T, V>, getShowPopup> getanswermap) {
        long jIconCompatParcelizer;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            jIconCompatParcelizer = setmeasurewithlargestchildenabled.getAudioAttributesImplBaseParcelizer();
        } else {
            jIconCompatParcelizer = (long) ((j - setweightsum.getRead()) / f);
        }
        RemoteActionCompatParcelizer(setweightsum, j, jIconCompatParcelizer, setmeasurewithlargestchildenabled, setshowdividers, getanswermap);
    }

    private static final <T, V extends ScrollingTabContainerView> void RemoteActionCompatParcelizer(setWeightSum<T, V> setweightsum, long j, long j2, setMeasureWithLargestChildEnabled<T, V> setmeasurewithlargestchildenabled, setShowDividers<T, V> setshowdividers, getAnswerMap<? super setWeightSum<T, V>, getShowPopup> getanswermap) {
        setweightsum.write(j);
        setweightsum.read(setmeasurewithlargestchildenabled.read(j2));
        setweightsum.read(setmeasurewithlargestchildenabled.IconCompatParcelizer(j2));
        if (setmeasurewithlargestchildenabled.write(j2)) {
            setweightsum.IconCompatParcelizer(setweightsum.getMediaBrowserCompatCustomActionResultReceiver());
            setweightsum.read(false);
        }
        RemoteActionCompatParcelizer(setweightsum, setshowdividers);
        getanswermap.invoke(setweightsum);
    }
}
