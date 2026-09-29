package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class adjustTsTimestamp {

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[XmlPullParserUtil.values().length];
            try {
                iArr[XmlPullParserUtil.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[XmlPullParserUtil.MediaBrowserCompatItemReceiver.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[XmlPullParserUtil.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplApi21Parcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[XmlPullParserUtil.IconCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[XmlPullParserUtil.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplApi26Parcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[XmlPullParserUtil.MediaBrowserCompatSearchResultReceiver.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[XmlPullParserUtil.AudioAttributesImplBaseParcelizer.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[XmlPullParserUtil.RemoteActionCompatParcelizer.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[XmlPullParserUtil.read.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            write = iArr;
        }
    }

    public static final ptsToUs IconCompatParcelizer(checkAndSet checkandset, String str, String str2, XmlPullParserUtil xmlPullParserUtil) {
        toMagicModuleMetaRepoModel.write(checkandset, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(xmlPullParserUtil, "");
        return new ptsToUs(checkandset.getAudioAttributesCompatParcelizer(), xmlPullParserUtil, checkandset.getWrite(), str2, checkandset.getAudioAttributesImplApi21Parcelizer(), str, false, 64, null);
    }

    public static final usToWrappedPts write(toBundleSparseArray tobundlesparsearray, String str, XmlPullParserUtil xmlPullParserUtil, boolean z) {
        toMagicModuleMetaRepoModel.write(tobundlesparsearray, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(xmlPullParserUtil, "");
        return new usToWrappedPts(tobundlesparsearray.write(), xmlPullParserUtil, tobundlesparsearray.RemoteActionCompatParcelizer().getAudioAttributesCompatParcelizer(), str, z ? tobundlesparsearray.RemoteActionCompatParcelizer().getMediaBrowserCompatItemReceiver() : 0);
    }

    public static final getTimestampOffsetUs RemoteActionCompatParcelizer(toBundleSparseArray tobundlesparsearray, pollFloor pollfloor, XmlPullParserUtil xmlPullParserUtil, String str, boolean z) {
        toMagicModuleMetaRepoModel.write(tobundlesparsearray, "");
        toMagicModuleMetaRepoModel.write(pollfloor, "");
        toMagicModuleMetaRepoModel.write(xmlPullParserUtil, "");
        toMagicModuleMetaRepoModel.write(str, "");
        String strWrite = pollfloor.write().length() == 0 ? "" : tobundlesparsearray.write();
        String audioAttributesCompatParcelizer = tobundlesparsearray.RemoteActionCompatParcelizer().getAudioAttributesCompatParcelizer();
        String strAudioAttributesCompatParcelizer = pollfloor.AudioAttributesCompatParcelizer();
        String strConcat = str.length() > 0 ? " • ".concat(String.valueOf(str)) : "";
        StringBuilder sb = new StringBuilder();
        sb.append(strAudioAttributesCompatParcelizer);
        sb.append(strConcat);
        return new getTimestampOffsetUs(strWrite, xmlPullParserUtil, audioAttributesCompatParcelizer, sb.toString(), tobundlesparsearray.RemoteActionCompatParcelizer().getIconCompatParcelizer(), pollfloor.write(), z ? tobundlesparsearray.RemoteActionCompatParcelizer().getMediaBrowserCompatItemReceiver() : 0);
    }

    public static final ptsToUs AudioAttributesCompatParcelizer(isHoleSpan isholespan, String str, String str2, XmlPullParserUtil xmlPullParserUtil) {
        toMagicModuleMetaRepoModel.write(isholespan, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(xmlPullParserUtil, "");
        String onPause = isholespan.getOnPause();
        String onPause2 = isholespan.getOnPause();
        String onPlayFromMediaId = isholespan.getOnPlayFromMediaId();
        setDownloadingStatesToQueued setdownloadingstatestoqueued = new setDownloadingStatesToQueued();
        String strIconCompatParcelizer = DashManifestParser.IconCompatParcelizer(onPause2, onPlayFromMediaId);
        toMagicModuleMetaRepoModel.write((Object) strIconCompatParcelizer);
        if (strIconCompatParcelizer.length() == 0) {
            throw new NullPointerException("MCQ-ERR: Content description not found");
        }
        Object objIconCompatParcelizer = setdownloadingstatestoqueued.IconCompatParcelizer(strIconCompatParcelizer, (Class<Object>) buildCacheKey.class);
        toMagicModuleMetaRepoModel.read(objIconCompatParcelizer, "");
        return new ptsToUs(onPause, xmlPullParserUtil, ((buildCacheKey) objIconCompatParcelizer).getMediaDescriptionCompat(), str2, isholespan.getAudioAttributesImplApi21Parcelizer(), str, false, 64, null);
    }

    public static final usToWrappedPts write(popFirst popfirst, int i) throws Throwable {
        toMagicModuleMetaRepoModel.write(popfirst, "");
        String remoteActionCompatParcelizer = popfirst.getRemoteActionCompatParcelizer();
        XmlPullParserUtil xmlPullParserUtilRemoteActionCompatParcelizer = VideoFrameProcessorListener.RemoteActionCompatParcelizer(popfirst.getRead());
        String audioAttributesImplApi21Parcelizer = popfirst.getAudioAttributesImplApi21Parcelizer();
        String audioAttributesImplApi26Parcelizer = popfirst.getAudioAttributesImplApi26Parcelizer();
        return new usToWrappedPts(remoteActionCompatParcelizer, xmlPullParserUtilRemoteActionCompatParcelizer, audioAttributesImplApi21Parcelizer, audioAttributesImplApi26Parcelizer == null ? "" : audioAttributesImplApi26Parcelizer, i);
    }

    public static final getTimestampOffsetUs IconCompatParcelizer(popFirst popfirst, int i) throws Throwable {
        toMagicModuleMetaRepoModel.write(popfirst, "");
        String remoteActionCompatParcelizer = popfirst.getRemoteActionCompatParcelizer();
        XmlPullParserUtil xmlPullParserUtilRemoteActionCompatParcelizer = VideoFrameProcessorListener.RemoteActionCompatParcelizer(popfirst.getRead());
        String audioAttributesImplApi21Parcelizer = popfirst.getAudioAttributesImplApi21Parcelizer();
        String audioAttributesImplApi26Parcelizer = popfirst.getAudioAttributesImplApi26Parcelizer();
        return new getTimestampOffsetUs(remoteActionCompatParcelizer, xmlPullParserUtilRemoteActionCompatParcelizer, audioAttributesImplApi21Parcelizer, audioAttributesImplApi26Parcelizer == null ? "" : audioAttributesImplApi26Parcelizer, popfirst.getMediaBrowserCompatCustomActionResultReceiver(), popfirst.getIconCompatParcelizer(), i);
    }

    public static final getFirstSampleTimestampUs AudioAttributesCompatParcelizer(isStartTagIgnorePrefix isstarttagignoreprefix) {
        toMagicModuleMetaRepoModel.write(isstarttagignoreprefix, "");
        switch (RemoteActionCompatParcelizer.write[isstarttagignoreprefix.AudioAttributesImplApi21Parcelizer().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (isstarttagignoreprefix instanceof buildNalUnitForChild) {
                    buildNalUnitForChild buildnalunitforchild = (buildNalUnitForChild) isstarttagignoreprefix;
                    return new usToWrappedPts(buildnalunitforchild.RemoteActionCompatParcelizer(), buildnalunitforchild.AudioAttributesCompatParcelizer(), buildnalunitforchild.write(), buildnalunitforchild.read(), buildnalunitforchild.IconCompatParcelizer());
                }
                break;
            case 8:
                if (isstarttagignoreprefix instanceof ColorInfo) {
                    ColorInfo colorInfo = (ColorInfo) isstarttagignoreprefix;
                    String write = colorInfo.getWrite();
                    String iconCompatParcelizer = colorInfo.getIconCompatParcelizer();
                    return new getTimestampOffsetUs(write, colorInfo.getAudioAttributesCompatParcelizer(), iconCompatParcelizer, colorInfo.getRead(), colorInfo.getRemoteActionCompatParcelizer(), colorInfo.getAudioAttributesImplApi21Parcelizer(), colorInfo.getMediaBrowserCompatItemReceiver());
                }
                break;
            case 9:
            case 10:
            case 11:
                if (isstarttagignoreprefix instanceof VideoFrameProcessorInputType) {
                    VideoFrameProcessorInputType videoFrameProcessorInputType = (VideoFrameProcessorInputType) isstarttagignoreprefix;
                    String write2 = videoFrameProcessorInputType.getWrite();
                    String iconCompatParcelizer2 = videoFrameProcessorInputType.getIconCompatParcelizer();
                    return new ptsToUs(write2, videoFrameProcessorInputType.getRead(), iconCompatParcelizer2, videoFrameProcessorInputType.getRemoteActionCompatParcelizer(), videoFrameProcessorInputType.getAudioAttributesCompatParcelizer(), videoFrameProcessorInputType.getAudioAttributesImplBaseParcelizer(), false, 64, null);
                }
                break;
            default:
                throw new RenewEligibleCreator();
        }
        return new usToWrappedPts(isstarttagignoreprefix.AudioAttributesImplApi26Parcelizer(), isstarttagignoreprefix.AudioAttributesImplApi21Parcelizer(), isstarttagignoreprefix.MediaBrowserCompatItemReceiver(), isstarttagignoreprefix.AudioAttributesImplBaseParcelizer(), 0, 16, null);
    }
}
