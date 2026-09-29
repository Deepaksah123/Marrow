###### Class com.android.installreferrer.api.InstallReferrerClient (com.android.installreferrer.api.InstallReferrerClient)
.class public abstract Lcom/android/installreferrer/api/InstallReferrerClient;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/installreferrer/api/InstallReferrerClient$AudioAttributesCompatParcelizer;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(Landroid/content/Context;)Lcom/android/installreferrer/api/InstallReferrerClient$AudioAttributesCompatParcelizer;
    .registers 3

    .line 1
    new-instance v0, Lcom/android/installreferrer/api/InstallReferrerClient$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/android/installreferrer/api/InstallReferrerClient$AudioAttributesCompatParcelizer;-><init>(Landroid/content/Context;B)V

    return-object v0
.end method


# virtual methods
.method public abstract IconCompatParcelizer()V
.end method

.method public abstract IconCompatParcelizer(Lcom/android/installreferrer/api/InstallReferrerStateListener;)V
.end method

.method public abstract RemoteActionCompatParcelizer()Lcom/android/installreferrer/api/ReferrerDetails;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation
.end method

###### Class com.android.installreferrer.api.InstallReferrerClient.AudioAttributesCompatParcelizer (com.android.installreferrer.api.InstallReferrerClient$AudioAttributesCompatParcelizer)
.class public final Lcom/android/installreferrer/api/InstallReferrerClient$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/installreferrer/api/InstallReferrerClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioAttributesCompatParcelizer"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/installreferrer/api/InstallReferrerClient$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/content/Context;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;B)V
    .registers 3

    .line 4
    invoke-direct {p0, p1}, Lcom/android/installreferrer/api/InstallReferrerClient$AudioAttributesCompatParcelizer;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Lcom/android/installreferrer/api/InstallReferrerClient;
    .registers 2

    iget-object p0, p0, Lcom/android/installreferrer/api/InstallReferrerClient$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:Landroid/content/Context;

    if-eqz p0, :cond_a

    .line 2
    new-instance v0, Lo/setPcmEncoding;

    invoke-direct {v0, p0}, Lo/setPcmEncoding;-><init>(Landroid/content/Context;)V

    return-object v0

    .line 1
    :cond_a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Please provide a valid Context."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
