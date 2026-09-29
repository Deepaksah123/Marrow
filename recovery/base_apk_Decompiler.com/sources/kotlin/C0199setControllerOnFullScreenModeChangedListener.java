package kotlin;

import android.view.KeyEvent;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.setControllerOnFullScreenModeChangedListener, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/Function1;", "Lo/constructType;", "", "p0", "Lo/setControllerHideOnTouch;", "write", "(Lo/getAnswerMap;)Lo/setControllerHideOnTouch;", "AudioAttributesCompatParcelizer", "Lo/setControllerHideOnTouch;", "read", "()Lo/setControllerHideOnTouch;", "RemoteActionCompatParcelizer"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class C0199setControllerOnFullScreenModeChangedListener {
    private static final setControllerHideOnTouch AudioAttributesCompatParcelizer = new IconCompatParcelizer(write(new downloadMagicModuleMetalambda0() { // from class: o.setControllerOnFullScreenModeChangedListener.RemoteActionCompatParcelizer
        @Override // kotlin.downloadMagicModuleMetalambda0, kotlin.isVideoNetworkError
        public final Object AudioAttributesCompatParcelizer(Object obj) {
            return Boolean.valueOf(_throwSubtypeClassNotAllowed.read(((constructType) obj).getRead()));
        }
    }));

    /* JADX INFO: renamed from: o.setControllerOnFullScreenModeChangedListener$write */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setControllerOnFullScreenModeChangedListener$write;", "Lo/setControllerHideOnTouch;", "Lo/constructType;", "p0", "Lo/setControllerAutoShow;", "IconCompatParcelizer", "(Landroid/view/KeyEvent;)Lo/setControllerAutoShow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements setControllerHideOnTouch {
        final /* synthetic */ getAnswerMap<constructType, Boolean> write;

        /* JADX WARN: Multi-variable type inference failed */
        write(getAnswerMap<? super constructType, Boolean> getanswermap) {
            this.write = getanswermap;
        }

        @Override // kotlin.setControllerHideOnTouch
        public final setControllerAutoShow IconCompatParcelizer(KeyEvent p0) {
            if (this.write.invoke(constructType.read(p0)).booleanValue() && _throwSubtypeClassNotAllowed.AudioAttributesImplBaseParcelizer(p0)) {
                if (_quotedString.read(_throwSubtypeClassNotAllowed.IconCompatParcelizer(p0), _quotedString.INSTANCE.onRemoveQueueItemAt())) {
                    return setControllerAutoShow.onPlayFromSearch;
                }
                return null;
            }
            if (this.write.invoke(constructType.read(p0)).booleanValue()) {
                long jIconCompatParcelizer = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
                if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.write()) || _quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.onAddQueueItem())) {
                    return setControllerAutoShow.AudioAttributesCompatParcelizer;
                }
                if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.onPrepare())) {
                    return setControllerAutoShow.onMediaButtonEvent;
                }
                if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.onPrepareFromSearch())) {
                    return setControllerAutoShow.read;
                }
                if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.read())) {
                    return setControllerAutoShow.onPrepareFromMediaId;
                }
                if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.onPlayFromSearch())) {
                    return setControllerAutoShow.onPlayFromSearch;
                }
                if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.onRemoveQueueItemAt())) {
                    return setControllerAutoShow.MediaSessionCompatQueueItem;
                }
                return null;
            }
            if (_throwSubtypeClassNotAllowed.read(p0)) {
                return null;
            }
            if (_throwSubtypeClassNotAllowed.AudioAttributesImplBaseParcelizer(p0)) {
                long jIconCompatParcelizer2 = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
                if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.MediaBrowserCompatMediaItem())) {
                    return setControllerAutoShow.onPrepareFromUri;
                }
                if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.MediaMetadataCompat())) {
                    return setControllerAutoShow.setSessionImpl;
                }
                if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.RatingCompat())) {
                    return setControllerAutoShow.PlaybackStateCompat;
                }
                if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
                    return setControllerAutoShow.onRemoveQueueItemAt;
                }
                if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.onPause())) {
                    return setControllerAutoShow.onStop;
                }
                if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.onPlay())) {
                    return setControllerAutoShow.onSkipToNext;
                }
                if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.onCustomAction())) {
                    return setControllerAutoShow.onSetCaptioningEnabled;
                }
                if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver())) {
                    return setControllerAutoShow.onSetPlaybackSpeed;
                }
                if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.onAddQueueItem())) {
                    return setControllerAutoShow.onMediaButtonEvent;
                }
                return null;
            }
            long jIconCompatParcelizer3 = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.MediaBrowserCompatMediaItem())) {
                return setControllerAutoShow.MediaBrowserCompatSearchResultReceiver;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.MediaMetadataCompat())) {
                return setControllerAutoShow.onPlayFromUri;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.RatingCompat())) {
                return setControllerAutoShow.MediaSessionCompatResultReceiverWrapper;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
                return setControllerAutoShow.RatingCompat;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.MediaBrowserCompatItemReceiver())) {
                return setControllerAutoShow.write;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.onPause())) {
                return setControllerAutoShow.onPlayFromMediaId;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.onPlay())) {
                return setControllerAutoShow.onPlay;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.onCustomAction())) {
                return setControllerAutoShow.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver())) {
                return setControllerAutoShow.onCustomAction;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.MediaDescriptionCompat()) || _quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.onFastForward())) {
                return setControllerAutoShow.onFastForward;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.RemoteActionCompatParcelizer())) {
                return setControllerAutoShow.AudioAttributesImplBaseParcelizer;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.AudioAttributesImplBaseParcelizer())) {
                return setControllerAutoShow.AudioAttributesImplApi26Parcelizer;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.onPlayFromMediaId())) {
                return setControllerAutoShow.onMediaButtonEvent;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.AudioAttributesImplApi21Parcelizer())) {
                return setControllerAutoShow.read;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.AudioAttributesImplApi26Parcelizer())) {
                return setControllerAutoShow.AudioAttributesCompatParcelizer;
            }
            if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.onPrepareFromMediaId())) {
                return setControllerAutoShow.MediaSessionCompatToken;
            }
            return null;
        }
    }

    public static final setControllerHideOnTouch write(getAnswerMap<? super constructType, Boolean> getanswermap) {
        return new write(getanswermap);
    }

    public static final setControllerHideOnTouch read() {
        return AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.setControllerOnFullScreenModeChangedListener$IconCompatParcelizer */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setControllerOnFullScreenModeChangedListener$IconCompatParcelizer;", "Lo/setControllerHideOnTouch;", "Lo/constructType;", "p0", "Lo/setControllerAutoShow;", "IconCompatParcelizer", "(Landroid/view/KeyEvent;)Lo/setControllerAutoShow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements setControllerHideOnTouch {
        final /* synthetic */ setControllerHideOnTouch read;

        IconCompatParcelizer(setControllerHideOnTouch setcontrollerhideontouch) {
            this.read = setcontrollerhideontouch;
        }

        @Override // kotlin.setControllerHideOnTouch
        public final setControllerAutoShow IconCompatParcelizer(KeyEvent p0) {
            setControllerAutoShow setcontrollerautoshow = null;
            if (_throwSubtypeClassNotAllowed.AudioAttributesImplBaseParcelizer(p0) && _throwSubtypeClassNotAllowed.read(p0)) {
                long jIconCompatParcelizer = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
                if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaBrowserCompatMediaItem())) {
                    setcontrollerautoshow = setControllerAutoShow.onRemoveQueueItem;
                } else if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaMetadataCompat())) {
                    setcontrollerautoshow = setControllerAutoShow.onSkipToQueueItem;
                } else if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.RatingCompat())) {
                    setcontrollerautoshow = setControllerAutoShow.onSkipToPrevious;
                } else if (_quotedString.read(jIconCompatParcelizer, _quotedString.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
                    setcontrollerautoshow = setControllerAutoShow.onSetRepeatMode;
                }
            } else if (_throwSubtypeClassNotAllowed.read(p0)) {
                long jIconCompatParcelizer2 = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
                if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.MediaBrowserCompatMediaItem())) {
                    setcontrollerautoshow = setControllerAutoShow.onCommand;
                } else if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.MediaMetadataCompat())) {
                    setcontrollerautoshow = setControllerAutoShow.onPrepare;
                } else if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.RatingCompat())) {
                    setcontrollerautoshow = setControllerAutoShow.onPrepareFromSearch;
                } else if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.MediaBrowserCompatCustomActionResultReceiver())) {
                    setcontrollerautoshow = setControllerAutoShow.onPause;
                } else if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.onCommand())) {
                    setcontrollerautoshow = setControllerAutoShow.AudioAttributesImplBaseParcelizer;
                } else if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.AudioAttributesImplBaseParcelizer())) {
                    setcontrollerautoshow = setControllerAutoShow.MediaBrowserCompatItemReceiver;
                } else if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.RemoteActionCompatParcelizer())) {
                    setcontrollerautoshow = setControllerAutoShow.AudioAttributesImplApi21Parcelizer;
                } else if (_quotedString.read(jIconCompatParcelizer2, _quotedString.INSTANCE.IconCompatParcelizer())) {
                    setcontrollerautoshow = setControllerAutoShow.MediaBrowserCompatMediaItem;
                }
            } else if (_throwSubtypeClassNotAllowed.AudioAttributesImplBaseParcelizer(p0)) {
                long jIconCompatParcelizer3 = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
                if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.onCustomAction())) {
                    setcontrollerautoshow = setControllerAutoShow.onSetCaptioningEnabled;
                } else if (_quotedString.read(jIconCompatParcelizer3, _quotedString.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver())) {
                    setcontrollerautoshow = setControllerAutoShow.onSetPlaybackSpeed;
                }
            } else if (_throwSubtypeClassNotAllowed.write(p0)) {
                long jIconCompatParcelizer4 = _throwSubtypeClassNotAllowed.IconCompatParcelizer(p0);
                if (_quotedString.read(jIconCompatParcelizer4, _quotedString.INSTANCE.RemoteActionCompatParcelizer())) {
                    setcontrollerautoshow = setControllerAutoShow.RemoteActionCompatParcelizer;
                } else if (_quotedString.read(jIconCompatParcelizer4, _quotedString.INSTANCE.AudioAttributesImplBaseParcelizer())) {
                    setcontrollerautoshow = setControllerAutoShow.MediaBrowserCompatCustomActionResultReceiver;
                }
            }
            return setcontrollerautoshow == null ? this.read.IconCompatParcelizer(p0) : setcontrollerautoshow;
        }
    }
}
