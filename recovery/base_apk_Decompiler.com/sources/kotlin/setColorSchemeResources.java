package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\u0007\u001a(\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\f\u0010\u000b\u001a\u0004\u0018\u00010\fX\u008a\u008e\u0002"}, d2 = {"ProvideDefaultPlatformTextContextMenuProviders", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ProvideBothDefaultProviders", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "foundation", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setColorSchemeResources {
    public static final void AudioAttributesCompatParcelizer(final _handleOddName _handleoddname, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i, final int i2) {
        int i3;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(155925518);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i3 & 19) != 18, i3 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (i4 != 0) {
                _handleoddname = _handleOddName.INSTANCE;
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(155925518, i3, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultPlatformTextContextMenuProviders (PlatformDefaultTextContextMenuProviders.android.kt:37)");
            }
            boolean z = _handleunrecognizedcharacterescapeWrite.write(setTrimPathOffset.RemoteActionCompatParcelizer()) != null;
            boolean z2 = _handleunrecognizedcharacterescapeWrite.write(setTrimPathOffset.AudioAttributesCompatParcelizer()) != null;
            if (z && z2) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1977187922);
                withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), true);
                int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, 0));
                _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescapeWrite.handleMediaPlayPauseIfPendingOnHandler();
                _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescapeWrite, _handleoddname);
                getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
                if (!(_handleunrecognizedcharacterescapeWrite.MediaMetadataCompat() instanceof _closeInput)) {
                    _getBigDecimal.write();
                }
                _handleunrecognizedcharacterescapeWrite.onPrepareFromMediaId();
                if (_handleunrecognizedcharacterescapeWrite.getParcelableVolumeInfo()) {
                    _handleunrecognizedcharacterescapeWrite.read(getcreatedondatemsIconCompatParcelizer);
                } else {
                    _handleunrecognizedcharacterescapeWrite.onPlayFromUri();
                }
                _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescapeWrite);
                NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
                NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
                NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
                NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
                setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
                magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescapeWrite, Integer.valueOf((i3 >> 3) & 14));
                _handleunrecognizedcharacterescapeWrite.AudioAttributesImplBaseParcelizer();
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else if (z) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1976997706);
                unScrap.RemoteActionCompatParcelizer(_handleoddname, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, i3 & 126, 0);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else if (z2) {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1976846922);
                setCoveredFadeColor.AudioAttributesCompatParcelizer(_handleoddname, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, i3 & 126);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            } else {
                _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(-1976716505);
                read(_handleoddname, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescapeWrite, i3 & 126);
                _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatCustomActionResultReceiver();
            }
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setProgressBackgroundColor
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setColorSchemeResources.RemoteActionCompatParcelizer(_handleoddname, magicModuleSubmissionRequestBody, i, i2, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void read(final _handleOddName _handleoddname, final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(790527681);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.AudioAttributesCompatParcelizer(_handleoddname) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(790527681, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideBothDefaultProviders (PlatformDefaultTextContextMenuProviders.android.kt:58)");
            }
            Object objOnPause = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = _qbuf.RemoteActionCompatParcelizer(null, _qbuf.AudioAttributesCompatParcelizer());
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause);
            }
            final InputAccessor inputAccessor = (InputAccessor) objOnPause;
            Object objOnPause2 = _handleunrecognizedcharacterescapeWrite.onPause();
            if (objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause2 = new getCreatedOnDateMs() { // from class: o.SwipeRefreshLayout
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return setColorSchemeResources.RemoteActionCompatParcelizer(inputAccessor);
                    }
                };
                _handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer(objOnPause2);
            }
            final getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause2;
            final getFillColor getfillcolor = setCoveredFadeColor.read(_handleunrecognizedcharacterescapeWrite, 0);
            resetAsNaN.AudioAttributesCompatParcelizer(new ContentReference[]{setTrimPathOffset.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(unScrap.RemoteActionCompatParcelizer((getCreatedOnDateMs<? extends isAbstract>) getcreatedondatems, (getAnswerMap<? super setOnChildScrollUpCallback, ? extends setOnChildScrollUpCallback>) null, _handleunrecognizedcharacterescapeWrite, 6, 2)), setTrimPathOffset.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(getfillcolor)}, multiplyFft.AudioAttributesCompatParcelizer(1070596993, true, new MagicModuleSubmissionRequestBody() { // from class: o.setBackgroundColorRes
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setColorSchemeResources.write(_handleoddname, inputAccessor, magicModuleSubmissionRequestBody, getfillcolor, getcreatedondatems, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, ContentReference.write | 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.setColorScheme
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return setColorSchemeResources.AudioAttributesCompatParcelizer(_handleoddname, magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final isAbstract read(InputAccessor<isAbstract> inputAccessor) {
        return inputAccessor.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final isAbstract RemoteActionCompatParcelizer(InputAccessor inputAccessor) {
        isAbstract isabstract = read(inputAccessor);
        if (isabstract != null) {
            return isabstract;
        }
        getRootStableInsets.IconCompatParcelizer("Required value was null.");
        throw new PlanDetailsCreator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(InputAccessor inputAccessor, isAbstract isabstract) {
        AudioAttributesCompatParcelizer(inputAccessor, isabstract);
        return getShowPopup.INSTANCE;
    }

    private static final void AudioAttributesCompatParcelizer(InputAccessor<isAbstract> inputAccessor, isAbstract isabstract) {
        inputAccessor.write(isabstract);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(_handleOddName _handleoddname, final InputAccessor inputAccessor, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, getFillColor getfillcolor, getCreatedOnDateMs getcreatedondatems, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(1070596993, i, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideBothDefaultProviders.<anonymous> (PlatformDefaultTextContextMenuProviders.android.kt:76)");
            }
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if (objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getAnswerMap() { // from class: o.setDistanceToTriggerSync
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setColorSchemeResources.IconCompatParcelizer(inputAccessor, (isAbstract) obj);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            _handleOddName _handleoddnameWrite = getNullAccessPattern.write(_handleoddname, (getAnswerMap) objOnPause);
            withTypeHandler withtypehandlerWrite = AbsSavedState1.write(_skipWSOrEnd.INSTANCE.MediaBrowserCompatSearchResultReceiver(), true);
            int iHashCode = Long.hashCode(_getBigDecimal.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, 0));
            _getCharDesc _getchardescHandleMediaPlayPauseIfPendingOnHandler = _handleunrecognizedcharacterescape.handleMediaPlayPauseIfPendingOnHandler();
            _handleOddName _handleoddnameRemoteActionCompatParcelizer = _verifyNLZ2.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape, _handleoddnameWrite);
            getCreatedOnDateMs<getDependencies> getcreatedondatemsIconCompatParcelizer = getDependencies.INSTANCE.IconCompatParcelizer();
            if (!(_handleunrecognizedcharacterescape.MediaMetadataCompat() instanceof _closeInput)) {
                _getBigDecimal.write();
            }
            _handleunrecognizedcharacterescape.onPrepareFromMediaId();
            if (_handleunrecognizedcharacterescape.getParcelableVolumeInfo()) {
                _handleunrecognizedcharacterescape.read(getcreatedondatemsIconCompatParcelizer);
            } else {
                _handleunrecognizedcharacterescape.onPlayFromUri();
            }
            _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape2 = NumberOutput.read(_handleunrecognizedcharacterescape);
            NumberOutput.write(_handleunrecognizedcharacterescape2, withtypehandlerWrite, getDependencies.INSTANCE.AudioAttributesImplBaseParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _getchardescHandleMediaPlayPauseIfPendingOnHandler, getDependencies.INSTANCE.MediaBrowserCompatItemReceiver());
            NumberOutput.RemoteActionCompatParcelizer(_handleunrecognizedcharacterescape2, Integer.valueOf(iHashCode), getDependencies.INSTANCE.AudioAttributesCompatParcelizer());
            NumberOutput.write(_handleunrecognizedcharacterescape2, getDependencies.INSTANCE.write());
            NumberOutput.write(_handleunrecognizedcharacterescape2, _handleoddnameRemoteActionCompatParcelizer, getDependencies.INSTANCE.MediaBrowserCompatCustomActionResultReceiver());
            setDrawerElevation setdrawerelevation = setDrawerElevation.INSTANCE;
            magicModuleSubmissionRequestBody.invoke(_handleunrecognizedcharacterescape, 0);
            getfillcolor.write(getcreatedondatems, _handleunrecognizedcharacterescape, 6);
            _handleunrecognizedcharacterescape.AudioAttributesImplBaseParcelizer();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(_handleOddName _handleoddname, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        read(_handleoddname, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(_handleOddName _handleoddname, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, int i2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i3) {
        AudioAttributesCompatParcelizer(_handleoddname, (MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup>) magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1), i2);
        return getShowPopup.INSTANCE;
    }
}
