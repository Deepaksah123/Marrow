package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ]\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u0016J/\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001dR\u0016\u0010\u001b\u001a\u00020\u00038\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00058\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00078\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\t8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b(\u0010'R\u0016\u0010\u001e\u001a\u00020\t8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\"\u0010'R\u0016\u0010 \u001a\u00020\r8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010&\u001a\u00020\u000f8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0016\u0010#\u001a\u00020\u00118\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u001b\u0010,R\u0016\u0010)\u001a\u00020\u00138\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b%\u0010-R\u0014\u00100\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/"}, d2 = {"Lo/getRootAlpha;", "Lo/addAbstractTypeResolver;", "Lo/hasIndex;", "Lo/withDelegate;", "p0", "Lo/hasValueTypeDeserializer;", "p1", "Lo/setImageDisplayMode;", "p2", "", "p3", "p4", "p5", "Lo/SettableBeanProperty;", "p6", "Lo/Typed3EpoxyController;", "p7", "Lo/KeyDeserializers;", "p8", "Lo/secondaryCount;", "p9", "<init>", "(Lo/withDelegate;Lo/hasValueTypeDeserializer;Lo/setImageDisplayMode;ZZZLo/SettableBeanProperty;Lo/Typed3EpoxyController;Lo/KeyDeserializers;Lo/secondaryCount;)V", "Lo/getConfigOverride;", "", "write", "(Lo/getConfigOverride;)V", "AudioAttributesCompatParcelizer", "", "(Lo/setImageDisplayMode;Ljava/lang/String;ZZ)V", "MediaBrowserCompatItemReceiver", "Lo/withDelegate;", "AudioAttributesImplBaseParcelizer", "Lo/hasValueTypeDeserializer;", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setImageDisplayMode;", "RemoteActionCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "Z", "read", "AudioAttributesImplApi21Parcelizer", "Lo/SettableBeanProperty;", "Lo/Typed3EpoxyController;", "Lo/KeyDeserializers;", "Lo/secondaryCount;", "l_", "()Z", "RatingCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getRootAlpha extends addAbstractTypeResolver implements hasIndex {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public KeyDeserializers MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    public SettableBeanProperty AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    public boolean read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    public hasValueTypeDeserializer IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    public setImageDisplayMode RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    public withDelegate AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public secondaryCount AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public boolean write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public Typed3EpoxyController AudioAttributesImplApi26Parcelizer;

    @Override // kotlin.hasIndex
    /* JADX INFO: renamed from: l_ */
    public final boolean getRead() {
        return true;
    }

    public getRootAlpha(withDelegate withdelegate, hasValueTypeDeserializer hasvaluetypedeserializer, setImageDisplayMode setimagedisplaymode, boolean z, boolean z2, boolean z3, SettableBeanProperty settableBeanProperty, Typed3EpoxyController typed3EpoxyController, KeyDeserializers keyDeserializers, secondaryCount secondarycount) {
        this.AudioAttributesCompatParcelizer = withdelegate;
        this.IconCompatParcelizer = hasvaluetypedeserializer;
        this.RemoteActionCompatParcelizer = setimagedisplaymode;
        this.read = z;
        this.write = z2;
        this.MediaBrowserCompatItemReceiver = z3;
        this.AudioAttributesImplBaseParcelizer = settableBeanProperty;
        this.AudioAttributesImplApi26Parcelizer = typed3EpoxyController;
        this.MediaBrowserCompatCustomActionResultReceiver = keyDeserializers;
        this.AudioAttributesImplApi21Parcelizer = secondarycount;
        typed3EpoxyController.write(new getCreatedOnDateMs() { // from class: o.setTabIndicatorColor
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getRootAlpha.MediaBrowserCompatCustomActionResultReceiver(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(getRootAlpha getrootalpha) {
        collectLongDefaults.IconCompatParcelizer(getrootalpha);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.hasIndex
    public final void write(final getConfigOverride getconfigoverride) {
        MapperBuilder.RemoteActionCompatParcelizer(getconfigoverride, this.IconCompatParcelizer.getRead());
        MapperBuilder.read(getconfigoverride, this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer());
        MapperBuilder.RemoteActionCompatParcelizer(getconfigoverride, this.IconCompatParcelizer.getAudioAttributesCompatParcelizer());
        MapperBuilder.write(getconfigoverride, _writeQuotedRaw.INSTANCE.read());
        _writeStringSegment _writestringsegmentAudioAttributesCompatParcelizer = _writeStringSegmentASCII2.AudioAttributesCompatParcelizer(_writeStringSegment.INSTANCE, this.IconCompatParcelizer.getRead());
        if (_writestringsegmentAudioAttributesCompatParcelizer != null) {
            MapperBuilder.write(getconfigoverride, _writestringsegmentAudioAttributesCompatParcelizer);
        }
        MapperBuilder.AudioAttributesCompatParcelizer$default(getconfigoverride, (String) null, new getAnswerMap() { // from class: o.setTextSpacing
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(getRootAlpha.read(this.AudioAttributesCompatParcelizer, (_writeStringSegment) obj));
            }
        }, 1, (Object) null);
        int write = this.MediaBrowserCompatCustomActionResultReceiver.getWrite();
        if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.AudioAttributesCompatParcelizer())) {
            MapperBuilder.write(getconfigoverride, _writeQuotedInt.INSTANCE.IconCompatParcelizer());
        } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.AudioAttributesImplBaseParcelizer()) || getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.IconCompatParcelizer())) {
            MapperBuilder.write(getconfigoverride, _writeQuotedInt.INSTANCE.AudioAttributesCompatParcelizer());
        } else if (getPropertyName.AudioAttributesCompatParcelizer(write, getPropertyName.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
            MapperBuilder.write(getconfigoverride, _writeQuotedInt.INSTANCE.read());
        }
        if (!this.write) {
            MapperBuilder.write(getconfigoverride);
        }
        if (this.MediaBrowserCompatItemReceiver) {
            MapperBuilder.read(getconfigoverride);
        }
        boolean z = this.write && !this.read;
        MapperBuilder.IconCompatParcelizer(getconfigoverride, z);
        MapperBuilder.RemoteActionCompatParcelizer$default(getconfigoverride, (String) null, new getAnswerMap() { // from class: o.setTabIndicatorColorResource
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(getRootAlpha.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, (List) obj));
            }
        }, 1, (Object) null);
        if (z) {
            MapperBuilder.write$default(getconfigoverride, (String) null, new getAnswerMap() { // from class: o.setDrawFullUnderline
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(getRootAlpha.RemoteActionCompatParcelizer(this.IconCompatParcelizer, (AbstractDeserializer) obj));
                }
            }, 1, (Object) null);
            MapperBuilder.IconCompatParcelizer$default(getconfigoverride, (String) null, new getAnswerMap() { // from class: o.PagerTitleStrip
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(getRootAlpha.read(this.write, getconfigoverride, (AbstractDeserializer) obj));
                }
            }, 1, (Object) null);
        }
        MapperBuilder.RemoteActionCompatParcelizer$default(getconfigoverride, (String) null, new getModuleData() { // from class: o.CustomVersionedParcelable
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(getRootAlpha.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue()));
            }
        }, 1, (Object) null);
        MapperBuilder.read$default(getconfigoverride, this.MediaBrowserCompatCustomActionResultReceiver.getAudioAttributesCompatParcelizer(), null, new getCreatedOnDateMs() { // from class: o.ParcelImpl
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getRootAlpha.MediaMetadataCompat(this.read));
            }
        }, 2, null);
        MapperBuilder.MediaBrowserCompatItemReceiver$default(getconfigoverride, null, new getCreatedOnDateMs() { // from class: o.setRootAlpha
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getRootAlpha.MediaBrowserCompatSearchResultReceiver(this.AudioAttributesCompatParcelizer));
            }
        }, 1, null);
        MapperBuilder.AudioAttributesImplApi21Parcelizer$default(getconfigoverride, null, new getCreatedOnDateMs() { // from class: o.setPathData
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getRootAlpha.MediaBrowserCompatMediaItem(this.RemoteActionCompatParcelizer));
            }
        }, 1, null);
        if (!findProperty.write(this.IconCompatParcelizer.getAudioAttributesCompatParcelizer()) && !this.MediaBrowserCompatItemReceiver) {
            MapperBuilder.RemoteActionCompatParcelizer$default(getconfigoverride, (String) null, new getCreatedOnDateMs() { // from class: o.getChangingConfigurations
                @Override // kotlin.getCreatedOnDateMs
                public final Object invoke() {
                    return Boolean.valueOf(getRootAlpha.MediaDescriptionCompat(this.RemoteActionCompatParcelizer));
                }
            }, 1, (Object) null);
            if (this.write && !this.read) {
                MapperBuilder.write$default(getconfigoverride, (String) null, new getCreatedOnDateMs() { // from class: o.setAlpha
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return Boolean.valueOf(getRootAlpha.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer));
                    }
                }, 1, (Object) null);
            }
        }
        if (!this.write || this.read) {
            return;
        }
        MapperBuilder.MediaMetadataCompat$default(getconfigoverride, null, new getCreatedOnDateMs() { // from class: o.PagerTabStrip
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(getRootAlpha.RatingCompat(this.AudioAttributesCompatParcelizer));
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(getRootAlpha getrootalpha, _writeStringSegment _writestringsegment) {
        getrootalpha.RemoteActionCompatParcelizer.IconCompatParcelizer(true);
        getrootalpha.RemoteActionCompatParcelizer.read(true);
        setImageDisplayMode setimagedisplaymode = getrootalpha.RemoteActionCompatParcelizer;
        CharSequence charSequenceWrite = _writestringsegment.write();
        toMagicModuleMetaRepoModel.read(charSequenceWrite, "");
        getrootalpha.AudioAttributesCompatParcelizer(setimagedisplaymode, (String) charSequenceWrite, getrootalpha.read, getrootalpha.write);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(getRootAlpha getrootalpha, List list) {
        if (getrootalpha.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer() == null) {
            return false;
        }
        hasStableIds hasstableidsAudioAttributesImplApi26Parcelizer = getrootalpha.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        toMagicModuleMetaRepoModel.write(hasstableidsAudioAttributesImplApi26Parcelizer);
        list.add(hasstableidsAudioAttributesImplApi26Parcelizer.getAudioAttributesCompatParcelizer());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(getRootAlpha getrootalpha, AbstractDeserializer abstractDeserializer) {
        getrootalpha.AudioAttributesCompatParcelizer(getrootalpha.RemoteActionCompatParcelizer, abstractDeserializer.getIconCompatParcelizer(), getrootalpha.read, getrootalpha.write);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean read(getRootAlpha getrootalpha, getConfigOverride getconfigoverride, AbstractDeserializer abstractDeserializer) {
        if (getrootalpha.read || !getrootalpha.write) {
            return false;
        }
        fillInStackTrace remoteActionCompatParcelizer = getrootalpha.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer != null) {
            MediaRouteVolumeSlider.INSTANCE.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new findBeanDeserializer[]{new findTreeNodeDeserializer(), new Deserializers(abstractDeserializer, 1)}), getrootalpha.RemoteActionCompatParcelizer.getWrite(), getrootalpha.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver(), remoteActionCompatParcelizer);
        } else {
            getrootalpha.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver().invoke(new hasValueTypeDeserializer(TestGroupLSModel.read(getrootalpha.IconCompatParcelizer.AudioAttributesCompatParcelizer(), findProperty.AudioAttributesImplBaseParcelizer(getrootalpha.IconCompatParcelizer.getAudioAttributesCompatParcelizer()), findProperty.read(getrootalpha.IconCompatParcelizer.getAudioAttributesCompatParcelizer()), abstractDeserializer).toString(), getValueInstantiator.IconCompatParcelizer(findProperty.AudioAttributesImplBaseParcelizer(getrootalpha.IconCompatParcelizer.getAudioAttributesCompatParcelizer()) + abstractDeserializer.length()), (findProperty) null, 4, (MagicModuleRepositoryImplExternalSyntheticLambda0) null));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(getRootAlpha getrootalpha, int i, int i2, boolean z) {
        if (!z) {
            i = getrootalpha.AudioAttributesImplBaseParcelizer.write(i);
        }
        if (!z) {
            i2 = getrootalpha.AudioAttributesImplBaseParcelizer.write(i2);
        }
        if (!getrootalpha.write) {
            return false;
        }
        if (i == findProperty.AudioAttributesImplBaseParcelizer(getrootalpha.IconCompatParcelizer.getAudioAttributesCompatParcelizer()) && i2 == findProperty.read(getrootalpha.IconCompatParcelizer.getAudioAttributesCompatParcelizer())) {
            return false;
        }
        if (Math.min(i, i2) >= 0 && Math.max(i, i2) <= getrootalpha.IconCompatParcelizer.getRead().length()) {
            if (z || i == i2) {
                getrootalpha.AudioAttributesImplApi26Parcelizer.MediaMetadataCompat();
            } else {
                Typed3EpoxyController.AudioAttributesCompatParcelizer$default(getrootalpha.AudioAttributesImplApi26Parcelizer, false, 1, null);
            }
            getrootalpha.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver().invoke(new hasValueTypeDeserializer(getrootalpha.IconCompatParcelizer.getRead(), getValueInstantiator.write(i, i2), (findProperty) null, 4, (MagicModuleRepositoryImplExternalSyntheticLambda0) null));
            return true;
        }
        getrootalpha.AudioAttributesImplApi26Parcelizer.MediaMetadataCompat();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaMetadataCompat(getRootAlpha getrootalpha) {
        getrootalpha.RemoteActionCompatParcelizer.RatingCompat().invoke(ResolvableDeserializer.read(getrootalpha.MediaBrowserCompatCustomActionResultReceiver.getAudioAttributesCompatParcelizer()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatSearchResultReceiver(getRootAlpha getrootalpha) {
        toggleControllerVisibility.RemoteActionCompatParcelizer(getrootalpha.RemoteActionCompatParcelizer, getrootalpha.AudioAttributesImplApi21Parcelizer, !getrootalpha.read);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaBrowserCompatMediaItem(getRootAlpha getrootalpha) {
        Typed3EpoxyController.AudioAttributesCompatParcelizer$default(getrootalpha.AudioAttributesImplApi26Parcelizer, false, 1, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MediaDescriptionCompat(getRootAlpha getrootalpha) {
        Typed3EpoxyController.write$default(getrootalpha.AudioAttributesImplApi26Parcelizer, false, 1, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesImplBaseParcelizer(getRootAlpha getrootalpha) {
        getrootalpha.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RatingCompat(getRootAlpha getrootalpha) {
        getrootalpha.AudioAttributesImplApi26Parcelizer.onRemoveQueueItemAt();
        return true;
    }

    public final void AudioAttributesCompatParcelizer(withDelegate p0, hasValueTypeDeserializer p1, setImageDisplayMode p2, boolean p3, boolean p4, boolean p5, SettableBeanProperty p6, Typed3EpoxyController p7, KeyDeserializers p8, secondaryCount p9) {
        boolean z = this.write;
        boolean z2 = false;
        boolean z3 = z && !this.read;
        boolean z4 = this.MediaBrowserCompatItemReceiver;
        KeyDeserializers keyDeserializers = this.MediaBrowserCompatCustomActionResultReceiver;
        Typed3EpoxyController typed3EpoxyController = this.AudioAttributesImplApi26Parcelizer;
        if (p4 && !p3) {
            z2 = true;
        }
        this.AudioAttributesCompatParcelizer = p0;
        this.IconCompatParcelizer = p1;
        this.RemoteActionCompatParcelizer = p2;
        this.read = p3;
        this.write = p4;
        this.AudioAttributesImplBaseParcelizer = p6;
        this.AudioAttributesImplApi26Parcelizer = p7;
        this.MediaBrowserCompatCustomActionResultReceiver = p8;
        this.AudioAttributesImplApi21Parcelizer = p9;
        if (p4 != z || z2 != z3 || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p8, keyDeserializers) || p5 != z4 || !findProperty.write(p1.getAudioAttributesCompatParcelizer())) {
            getValueNulls.write(this);
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p7, typed3EpoxyController)) {
            return;
        }
        p7.write(new getCreatedOnDateMs() { // from class: o.getAlpha
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getRootAlpha.onCommand(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup onCommand(getRootAlpha getrootalpha) {
        collectLongDefaults.IconCompatParcelizer(getrootalpha);
        return getShowPopup.INSTANCE;
    }

    private final void AudioAttributesCompatParcelizer(setImageDisplayMode p0, String p1, boolean p2, boolean p3) {
        if (p2 || !p3) {
            return;
        }
        fillInStackTrace remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer != null) {
            MediaRouteVolumeSlider.INSTANCE.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new findBeanDeserializer[]{new findCollectionLikeDeserializer(), new Deserializers(p1, 1)}), p0.getWrite(), p0.MediaBrowserCompatSearchResultReceiver(), remoteActionCompatParcelizer);
        } else {
            p0.MediaBrowserCompatSearchResultReceiver().invoke(new hasValueTypeDeserializer(p1, getValueInstantiator.IconCompatParcelizer(p1.length()), (findProperty) null, 4, (MagicModuleRepositoryImplExternalSyntheticLambda0) null));
        }
    }
}
