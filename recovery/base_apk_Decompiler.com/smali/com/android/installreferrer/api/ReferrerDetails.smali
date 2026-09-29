###### Class com.android.installreferrer.api.ReferrerDetails (com.android.installreferrer.api.ReferrerDetails)
.class public Lcom/android/installreferrer/api/ReferrerDetails;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final RemoteActionCompatParcelizer:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .registers 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/installreferrer/api/ReferrerDetails;->RemoteActionCompatParcelizer:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer()J
    .registers 3

    iget-object p0, p0, Lcom/android/installreferrer/api/ReferrerDetails;->RemoteActionCompatParcelizer:Landroid/os/Bundle;

    .line 1
    const-string v0, "install_begin_timestamp_seconds"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final RemoteActionCompatParcelizer()J
    .registers 3

    iget-object p0, p0, Lcom/android/installreferrer/api/ReferrerDetails;->RemoteActionCompatParcelizer:Landroid/os/Bundle;

    .line 1
    const-string v0, "referrer_click_timestamp_seconds"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final read()Ljava/lang/String;
    .registers 2

    iget-object p0, p0, Lcom/android/installreferrer/api/ReferrerDetails;->RemoteActionCompatParcelizer:Landroid/os/Bundle;

    .line 1
    const-string v0, "install_referrer"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
