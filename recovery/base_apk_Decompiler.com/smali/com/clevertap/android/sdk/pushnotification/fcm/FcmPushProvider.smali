###### Class com.clevertap.android.sdk.pushnotification.fcm.FcmPushProvider (com.clevertap.android.sdk.pushnotification.fcm.FcmPushProvider)
.class public Lcom/clevertap/android/sdk/pushnotification/fcm/FcmPushProvider;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/Timeline1;


# instance fields
.field private handler:Lo/hasPlayedAdGroup;


# direct methods
.method public constructor <init>(Lo/TimelinePeriod;Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V
    .registers 5

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance v0, Lo/getDurationMs;

    invoke-direct {v0, p1, p2, p3}, Lo/getDurationMs;-><init>(Lo/TimelinePeriod;Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)V

    iput-object v0, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/FcmPushProvider;->handler:Lo/hasPlayedAdGroup;

    return-void
.end method


# virtual methods
.method public getPushType()Lo/getAdsId;
    .registers 1

    .line 29
    iget-object p0, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/FcmPushProvider;->handler:Lo/hasPlayedAdGroup;

    invoke-interface {p0}, Lo/hasPlayedAdGroup;->RemoteActionCompatParcelizer()Lo/getAdsId;

    move-result-object p0

    return-object p0
.end method

.method public isAvailable()Z
    .registers 1

    .line 39
    iget-object p0, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/FcmPushProvider;->handler:Lo/hasPlayedAdGroup;

    invoke-interface {p0}, Lo/hasPlayedAdGroup;->write()Z

    move-result p0

    return p0
.end method

.method public isSupported()Z
    .registers 1

    .line 49
    iget-object p0, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/FcmPushProvider;->handler:Lo/hasPlayedAdGroup;

    invoke-interface {p0}, Lo/hasPlayedAdGroup;->IconCompatParcelizer()Z

    move-result p0

    return p0
.end method

.method public minSDKSupportVersionCode()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public requestToken()V
    .registers 1

    .line 59
    iget-object p0, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/FcmPushProvider;->handler:Lo/hasPlayedAdGroup;

    invoke-interface {p0}, Lo/hasPlayedAdGroup;->AudioAttributesCompatParcelizer()V

    return-void
.end method

.method setHandler(Lo/hasPlayedAdGroup;)V
    .registers 2

    .line 63
    iput-object p1, p0, Lcom/clevertap/android/sdk/pushnotification/fcm/FcmPushProvider;->handler:Lo/hasPlayedAdGroup;

    return-void
.end method
